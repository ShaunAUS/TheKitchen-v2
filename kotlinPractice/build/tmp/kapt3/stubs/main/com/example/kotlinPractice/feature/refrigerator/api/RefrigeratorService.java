package com.example.kotlinPractice.feature.refrigerator.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&\u00a8\u0006\r"}, d2 = {"Lcom/example/kotlinPractice/feature/refrigerator/api/RefrigeratorService;", "", "createRefrigerator", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorInfoDto;", "refrigeratorCreateDto", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorCreateDto;", "kitchenId", "", "getRefrigerator", "refrigeratorId", "remove", "", "updateRefrigerator", "kotlinPractice"})
public abstract interface RefrigeratorService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto getRefrigerator(long refrigeratorId);
    
    public abstract void remove(long refrigeratorId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto createRefrigerator(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto refrigeratorCreateDto, long kitchenId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto updateRefrigerator(long refrigeratorId);
}