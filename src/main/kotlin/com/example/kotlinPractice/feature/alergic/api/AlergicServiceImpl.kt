package com.example.kotlinPractice.feature.alergic.api

import com.example.kotlinPractice.domain.entity.Alergic
import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.domain.enums.AlergicType
import com.example.kotlinPractice.domain.repository.AlergicRepository
import org.springframework.stereotype.Service

@Service
class AlergicServiceImpl(
    private val alergicRepository: AlergicRepository,
) : AlergicService {
    override fun createAlergic(alergicTypes: List<AlergicType>, savedMenu: Menu) {
        alergicRepository.saveAll(alergicTypes.map { Alergic.of(it, savedMenu) })
    }

    override fun updateAlergic(newAlergics: List<AlergicType>, updatedMenu: Menu) {
        val oldAlergics = alergicRepository.findByMenuId(updatedMenu.id)
        val oldAlergicTypes = oldAlergicTypesToSet(oldAlergics)
        val newAlergicTypes = newAlergicTypesToSet(newAlergics)

        deleteFromOldAlergicTypes(oldAlergics, oldAlergicTypes, newAlergicTypes)
        saveNewAlergicTypes(newAlergicTypes, oldAlergicTypes, updatedMenu)
    }

    override fun delete(menuId: Long) {
        alergicRepository.findByMenuId(menuId).map { it.delete() }
    }

    private fun saveNewAlergicTypes(
        newAlergicTypes: Set<AlergicType>,
        oldAlergicTypes: Set<AlergicType>,
        updatedMenu: Menu,
    ) {
        alergicRepository.saveAll(
            makeToAddAlergicTypeList(newAlergicTypes, oldAlergicTypes)
                .map { Alergic.of(it, updatedMenu) },
        )
    }

    private fun deleteFromOldAlergicTypes(
        oldAlergics: List<Alergic>,
        oldAlergicTypes: Set<AlergicType>,
        newAlergicTypes: Set<AlergicType>,
    ) {
        oldAlergics
            .filter { doesNotExistFromNewAlergicTypes(it, oldAlergicTypes, newAlergicTypes) }
            .forEach { alergicRepository.delete(it) }
    }

    private fun doesNotExistFromNewAlergicTypes(
        it: Alergic,
        oldAlergicTypes: Set<AlergicType>,
        newAlergicTypes: Set<AlergicType>,
    ) = getAlergicEnumType(it) in makeToRemoveAlergicTypeList(oldAlergicTypes, newAlergicTypes)

    private fun getAlergicEnumType(it: Alergic): AlergicType {
        return AlergicType.toType(it.type)
    }

    private fun makeToRemoveAlergicTypeList(
        oldAlergicTypes: Set<AlergicType>,
        newAlergicTypes: Set<AlergicType>,
    ): List<AlergicType> {
        return oldAlergicTypes.filter { doesNotExistFromNewAlergicTypes(it, newAlergicTypes) }
    }

    private fun doesNotExistFromNewAlergicTypes(
        it: AlergicType,
        newAlergicTypes: Set<AlergicType>,
    ) = it !in newAlergicTypes

    private fun makeToAddAlergicTypeList(
        newAlergicTypes: Set<AlergicType>,
        oldAlergicTypes: Set<AlergicType>,
    ): List<AlergicType> {
        return newAlergicTypes.filter { doesNotExistFromOldAlergicTypes(it, oldAlergicTypes) }
    }

    private fun doesNotExistFromOldAlergicTypes(
        it: AlergicType,
        oldAlergicTypes: Set<AlergicType>,
    ) = it !in oldAlergicTypes

    private fun oldAlergicTypesToSet(oldAlergics: List<Alergic>): Set<AlergicType> {
        return oldAlergics.map { AlergicType.toType(it.type) }.toSet()
    }

    private fun newAlergicTypesToSet(newAlergics: List<AlergicType>): Set<AlergicType> {
        return newAlergics.toSet()
    }
}
