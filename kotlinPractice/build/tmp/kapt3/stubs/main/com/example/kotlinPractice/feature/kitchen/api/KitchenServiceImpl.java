package com.example.kotlinPractice.feature.kitchen.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinPractice/feature/kitchen/api/KitchenServiceImpl;", "Lcom/example/kotlinPractice/feature/kitchen/api/KitchenService;", "kitchenRepository", "Lcom/example/kotlinPractice/domain/repository/KitchenRepository;", "(Lcom/example/kotlinPractice/domain/repository/KitchenRepository;)V", "createKitchen", "Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenInfoDto;", "createKitchenDto", "Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenCreateDto;", "kotlinPractice"})
@org.springframework.stereotype.Service
public class KitchenServiceImpl implements com.example.kotlinPractice.feature.kitchen.api.KitchenService {
    private final com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository = null;
    
    public KitchenServiceImpl(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto createKitchen(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto createKitchenDto) {
        return null;
    }
}