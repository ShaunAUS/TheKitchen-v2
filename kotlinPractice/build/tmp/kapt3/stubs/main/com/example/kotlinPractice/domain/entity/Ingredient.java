package com.example.kotlinPractice.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006("}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Ingredient;", "", "id", "", "name", "", "buyDate", "Ljava/time/LocalDate;", "expireDate", "expirationPeriod", "", "quantity", "refrigerator", "Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;IILcom/example/kotlinPractice/domain/entity/Refrigerator;)V", "getBuyDate", "()Ljava/time/LocalDate;", "getExpirationPeriod", "()I", "setExpirationPeriod", "(I)V", "getExpireDate", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getQuantity", "setQuantity", "getRefrigerator", "()Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "setRefrigerator", "(Lcom/example/kotlinPractice/domain/entity/Refrigerator;)V", "addIngredientQuantity", "", "updateExpirationPeriod", "toDays", "updateIngredientQuantity", "useQuantity", "Companion", "kotlinPractice"})
@jakarta.persistence.Entity
public final class Ingredient {
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private final java.time.LocalDate buyDate = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private final java.time.LocalDate expireDate = null;
    @jakarta.persistence.Column(nullable = false)
    private int expirationPeriod;
    @jakarta.persistence.Column(nullable = false)
    private int quantity;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.JoinColumn(name = "refrigerator_id")
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    private com.example.kotlinPractice.domain.entity.Refrigerator refrigerator;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlinPractice.domain.entity.Ingredient.Companion Companion = null;
    
    public Ingredient(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.time.LocalDate buyDate, @org.jetbrains.annotations.NotNull
    java.time.LocalDate expireDate, int expirationPeriod, int quantity, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Refrigerator refrigerator) {
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
    public final java.time.LocalDate getBuyDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getExpireDate() {
        return null;
    }
    
    public final int getExpirationPeriod() {
        return 0;
    }
    
    public final void setExpirationPeriod(int p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.entity.Refrigerator getRefrigerator() {
        return null;
    }
    
    public final void setRefrigerator(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Refrigerator p0) {
    }
    
    public final void updateIngredientQuantity(int useQuantity) {
    }
    
    public final void addIngredientQuantity(int quantity) {
    }
    
    public final void updateExpirationPeriod(long toDays) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Ingredient$Companion;", "", "()V", "of", "Lcom/example/kotlinPractice/domain/entity/Ingredient;", "ingredientCreateDto", "Lcom/example/kotlinPractice/feature/ingredient/api/dto/IngredientCreateDto;", "refrigerator", "Lcom/example/kotlinPractice/domain/entity/Refrigerator;", "kotlinPractice"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinPractice.domain.entity.Ingredient of(@org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.feature.ingredient.api.dto.IngredientCreateDto ingredientCreateDto, @org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.domain.entity.Refrigerator refrigerator) {
            return null;
        }
    }
}