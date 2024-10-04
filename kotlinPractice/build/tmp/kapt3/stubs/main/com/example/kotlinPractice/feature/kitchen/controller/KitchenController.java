package com.example.kotlinPractice.feature.kitchen.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kotlinPractice/feature/kitchen/controller/KitchenController;", "", "kitchenService", "Lcom/example/kotlinPractice/feature/kitchen/api/KitchenService;", "(Lcom/example/kotlinPractice/feature/kitchen/api/KitchenService;)V", "getKitchenService", "()Lcom/example/kotlinPractice/feature/kitchen/api/KitchenService;", "createKitchen", "Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenInfoDto;", "createKitchenDto", "Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenCreateDto;", "kotlinPractice"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/kitchen"})
@org.springframework.web.bind.annotation.RestController
public class KitchenController {
    @org.jetbrains.annotations.NotNull
    private final com.example.kotlinPractice.feature.kitchen.api.KitchenService kitchenService = null;
    
    public KitchenController(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.kitchen.api.KitchenService kitchenService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.kotlinPractice.feature.kitchen.api.KitchenService getKitchenService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto createKitchen(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto createKitchenDto) {
        return null;
    }
}