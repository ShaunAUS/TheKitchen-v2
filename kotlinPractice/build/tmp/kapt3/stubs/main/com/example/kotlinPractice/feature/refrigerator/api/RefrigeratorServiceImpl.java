package com.example.kotlinPractice.feature.refrigerator.api;

import java.lang.System;

@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0012J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0012J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0013J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kotlinPractice/feature/refrigerator/api/RefrigeratorServiceImpl;", "Lcom/example/kotlinPractice/feature/refrigerator/api/RefrigeratorService;", "refrigeratorRepository", "Lcom/example/kotlinPractice/domain/repository/RefrigeratorRepository;", "kitchenRepository", "Lcom/example/kotlinPractice/domain/repository/KitchenRepository;", "(Lcom/example/kotlinPractice/domain/repository/RefrigeratorRepository;Lcom/example/kotlinPractice/domain/repository/KitchenRepository;)V", "createRefrigerator", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorInfoDto;", "refrigeratorCreateDto", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorCreateDto;", "kitchenId", "", "findKitchenOrThrow", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "findRefrigeratorOrThrow", "Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "refrigeratorId", "getRefrigerator", "remove", "", "upToDateIngredientDate", "refrigerator", "updateRefrigerator", "kotlinPractice"})
@org.springframework.stereotype.Service
public class RefrigeratorServiceImpl implements com.example.kotlinPractice.feature.refrigerator.api.RefrigeratorService {
    private final com.example.kotlinPractice.domain.repository.RefrigeratorRepository refrigeratorRepository = null;
    private final com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository = null;
    
    public RefrigeratorServiceImpl(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.RefrigeratorRepository refrigeratorRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto getRefrigerator(long refrigeratorId) {
        return null;
    }
    
    @java.lang.Override
    public void remove(long refrigeratorId) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto createRefrigerator(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto refrigeratorCreateDto, long kitchenId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto updateRefrigerator(long refrigeratorId) {
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