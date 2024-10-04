package com.example.kotlinPractice.feature.ingredient.api;

import java.lang.System;

@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0012J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0012H\u0013J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/kotlinPractice/feature/ingredient/api/IngredientServiceImpl;", "Lcom/example/kotlinPractice/feature/ingredient/api/IngredientService;", "refrigeratorRepository", "Lcom/example/kotlinPractice/domain/repository/RefrigeratorRepository;", "ingredientRepository", "Lcom/example/kotlinPractice/domain/repository/IngredientRepository;", "kitchenRepository", "Lcom/example/kotlinPractice/domain/repository/KitchenRepository;", "(Lcom/example/kotlinPractice/domain/repository/RefrigeratorRepository;Lcom/example/kotlinPractice/domain/repository/IngredientRepository;Lcom/example/kotlinPractice/domain/repository/KitchenRepository;)V", "addIngredient", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorInfoDto;", "addIngredientDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/AddIngredientDto;", "findKitchenOrThrow", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "kitchenId", "", "findRefrigeratorOrThrow", "Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "refrigeratorId", "noticeIfNotEnoughtQuantity", "", "quantity", "", "upToDateIngredientDate", "refrigerator", "useIngredient", "useIngredientDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/UseIngredientDto;", "kotlinPractice"})
@org.springframework.stereotype.Service
public class IngredientServiceImpl implements com.example.kotlinPractice.feature.ingredient.api.IngredientService {
    private final com.example.kotlinPractice.domain.repository.RefrigeratorRepository refrigeratorRepository = null;
    private final com.example.kotlinPractice.domain.repository.IngredientRepository ingredientRepository = null;
    private final com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository = null;
    
    public IngredientServiceImpl(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.RefrigeratorRepository refrigeratorRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.IngredientRepository ingredientRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto useIngredient(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.ingredient.api.dto.UseIngredientDto useIngredientDto) {
        return null;
    }
    
    private void noticeIfNotEnoughtQuantity(int quantity) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto addIngredient(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.ingredient.api.dto.AddIngredientDto addIngredientDto) {
        return null;
    }
    
    private com.example.kotlinPractice.domain.entity.Kitchen findKitchenOrThrow(long kitchenId) {
        return null;
    }
    
    private com.example.kotlinPractice.domain.entity.Refrigerator findRefrigeratorOrThrow(long refrigeratorId) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional
    private void upToDateIngredientDate(com.example.kotlinPractice.domain.entity.Refrigerator refrigerator) {
    }
}