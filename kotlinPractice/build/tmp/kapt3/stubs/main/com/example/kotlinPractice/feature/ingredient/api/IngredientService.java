package com.example.kotlinPractice.feature.ingredient.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinPractice/feature/ingredient/api/IngredientService;", "", "addIngredient", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorInfoDto;", "addIngredientDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/AddIngredientDto;", "useIngredient", "useIngredientDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/UseIngredientDto;", "kotlinPractice"})
public abstract interface IngredientService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto useIngredient(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.ingredient.api.dto.UseIngredientDto useIngredientDto);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto addIngredient(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.ingredient.api.dto.AddIngredientDto addIngredientDto);
}