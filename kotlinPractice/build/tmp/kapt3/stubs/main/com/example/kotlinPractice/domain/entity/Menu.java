package com.example.kotlinPractice.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Menu;", "", "id", "", "name", "", "price", "", "alergicType", "kitchen", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "(Ljava/lang/Long;Ljava/lang/String;IILcom/example/kotlinPractice/domain/entity/Kitchen;)V", "getAlergicType", "()I", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKitchen", "()Lcom/example/kotlinPractice/domain/entity/Kitchen;", "getName", "()Ljava/lang/String;", "getPrice", "kotlinPractice"})
@jakarta.persistence.Entity
public final class Menu {
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private final java.lang.String name = null;
    @jakarta.persistence.Column(nullable = false)
    private final int price = 0;
    @jakarta.persistence.Column(nullable = false)
    private final int alergicType = 0;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.JoinColumn(name = "kitchen_id")
    @jakarta.persistence.ManyToOne
    private final com.example.kotlinPractice.domain.entity.Kitchen kitchen = null;
    
    public Menu(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int price, int alergicType, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Kitchen kitchen) {
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
    
    public final int getPrice() {
        return 0;
    }
    
    public final int getAlergicType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.entity.Kitchen getKitchen() {
        return null;
    }
}