package com.example.kotlinPractice.feature.member.api.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\tH\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto;", "", "name", "", "level", "Lcom/example/kotlinPractice/domain/enums/LevelType;", "section", "Lcom/example/kotlinPractice/domain/enums/SectionType;", "experience", "", "kitchen", "Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenInfoDto;", "(Ljava/lang/String;Lcom/example/kotlinPractice/domain/enums/LevelType;Lcom/example/kotlinPractice/domain/enums/SectionType;Ljava/lang/Integer;Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenInfoDto;)V", "getExperience", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKitchen", "()Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenInfoDto;", "getLevel", "()Lcom/example/kotlinPractice/domain/enums/LevelType;", "getName", "()Ljava/lang/String;", "getSection", "()Lcom/example/kotlinPractice/domain/enums/SectionType;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/example/kotlinPractice/domain/enums/LevelType;Lcom/example/kotlinPractice/domain/enums/SectionType;Ljava/lang/Integer;Lcom/example/kotlinPractice/feature/kitchen/api/dto/KitchenInfoDto;)Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto;", "equals", "", "other", "hashCode", "toString", "Companion", "kotlinPractice"})
public final class MemberInfoDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.kotlinPractice.domain.enums.LevelType level = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.kotlinPractice.domain.enums.SectionType section = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer experience = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto kitchen = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.enums.LevelType level, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.enums.SectionType section, @org.jetbrains.annotations.Nullable
    java.lang.Integer experience, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto kitchen) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MemberInfoDto(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.enums.LevelType level, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.enums.SectionType section, @org.jetbrains.annotations.Nullable
    java.lang.Integer experience, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto kitchen) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.enums.LevelType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.enums.LevelType getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.enums.SectionType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.enums.SectionType getSection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getExperience() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto getKitchen() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto$Companion;", "", "()V", "of", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto;", "member", "Lcom/example/kotlinPractice/domain/entity/Member;", "kotlinPractice"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto of(@org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.domain.entity.Member member) {
            return null;
        }
    }
}