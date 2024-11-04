package com.example.kotlinPractice.domain.repository

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.repository.querydsl.MemberRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>, MemberRepositoryCustom
