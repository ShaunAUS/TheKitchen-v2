package com.example.kotlinPractice.feature.ingredient.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlinPractice/feature/ingredient/controller/IngredientController;", "", "ingredientService", "Lcom/example/kotlinPractice/feature/ingredient/api/IngredientService;", "(Lcom/example/kotlinPractice/feature/ingredient/api/IngredientService;)V", "buyIngredient", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorInfoDto;", "addIngredientDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/AddIngredientDto;", "useIngredient", "useIngredientDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/UseIngredientDto;", "kotlinPractice"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/ingredient"})
@org.springframework.web.bind.annotation.RestController
public class IngredientController {
    private final com.example.kotlinPractice.feature.ingredient.api.IngredientService ingredientService = null;
    
    public IngredientController(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.ingredient.api.IngredientService ingredientService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto buyIngredient(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.kotlinPractice.feature.ingredient.api.dto.AddIngredientDto addIngredientDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {""})
    public com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto useIngredient(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.kotlinPractice.feature.ingredient.api.dto.UseIngredientDto useIngredientDto) {
        return null;
    }
}