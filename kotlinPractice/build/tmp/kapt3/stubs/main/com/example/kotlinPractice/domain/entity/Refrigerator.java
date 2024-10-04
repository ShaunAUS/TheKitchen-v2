package com.example.kotlinPractice.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "", "id", "", "name", "", "kitchen", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "ingredients", "", "Lcom/example/kotlinPractice/domain/entity/Ingredient;", "(Ljava/lang/Long;Ljava/lang/String;Lcom/example/kotlinPractice/domain/entity/Kitchen;Ljava/util/List;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIngredients", "()Ljava/util/List;", "getKitchen", "()Lcom/example/kotlinPractice/domain/entity/Kitchen;", "setKitchen", "(Lcom/example/kotlinPractice/domain/entity/Kitchen;)V", "getName", "()Ljava/lang/String;", "Companion", "kotlinPractice"})
@jakarta.persistence.Entity
public final class Refrigerator {
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.JoinColumn(name = "kitchen_id")
    @jakarta.persistence.ManyToOne
    private com.example.kotlinPractice.domain.entity.Kitchen kitchen;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.OneToMany(mappedBy = "refrigerator", orphanRemoval = true)
    private final java.util.List<com.example.kotlinPractice.domain.entity.Ingredient> ingredients = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlinPractice.domain.entity.Refrigerator.Companion Companion = null;
    
    public Refrigerator(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Kitchen kitchen, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.kotlinPractice.domain.entity.Ingredient> ingredients) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.entity.Kitchen getKitchen() {
        return null;
    }
    
    public final void setKitchen(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Kitchen p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.kotlinPractice.domain.entity.Ingredient> getIngredients() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Refrigerator$Companion;", "", "()V", "of", "Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "refrigeratorCreateDto", "Lcom/example/kotlinPractice/feature/refrigerator/api/dto/RefrigeratorCreateDto;", "kitchen", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "kotlinPractice"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinPractice.domain.entity.Refrigerator of(@org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto refrigeratorCreateDto, @org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.domain.entity.Kitchen kitchen) {
            return null;
        }
    }
}