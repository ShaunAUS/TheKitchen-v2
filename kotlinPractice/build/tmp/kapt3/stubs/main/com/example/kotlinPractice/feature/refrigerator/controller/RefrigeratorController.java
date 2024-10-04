package com.example.kotlinPractice.feature.refrigerator.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0012\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\nH\u0017J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\nH\u0017J\u0012\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/kotlinPractice/feature/refrigerator/controller/RefrigeratorController;", "", "refrigeratorService", "Lcom/example/kotlinPractice/feature/refrigerator/api/RefrigeratorService;", "(Lcom/example/kotlinPractice/feature/refrigerator/api/RefrigeratorService;)V", "createRefrigerator", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorInfoDto;", "refrigeratorCreateDto", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorCreateDto;", "kitchenId", "", "getRefrigeratorStatus", "refrigeratorId", "removeRefrigerator", "", "updateRefrigerator", "kotlinPractice"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/refrigerator"})
@org.springframework.web.bind.annotation.RestController
public class RefrigeratorController {
    private final com.example.kotlinPractice.feature.refrigerator.api.RefrigeratorService refrigeratorService = null;
    
    public RefrigeratorController(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.refrigerator.api.RefrigeratorService refrigeratorService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto createRefrigerator(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto refrigeratorCreateDto, @org.springframework.web.bind.annotation.RequestParam(value = "kitchenId")
    long kitchenId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/uptodate"})
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto updateRefrigerator(@org.springframework.web.bind.annotation.RequestParam(value = "refrigeratorId")
    long refrigeratorId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{refrigeratorId}"})
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto getRefrigeratorStatus(@org.springframework.web.bind.annotation.PathVariable
    long refrigeratorId) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{refrigeratorId}"})
    public void removeRefrigerator(@org.springframework.web.bind.annotation.PathVariable
    long refrigeratorId) {
    }
}