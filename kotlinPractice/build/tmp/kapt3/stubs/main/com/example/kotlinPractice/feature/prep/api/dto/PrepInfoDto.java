package com.example.kotlinPractice.feature.prep.api.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/example/kotlinPractice/feature/prep/api/dto/PrepInfoDto;", "", "job", "", "priority", "", "executionType", "Lcom/example/kotlinPractice/domain/enums/ExecutionType;", "executionDate", "Ljava/time/LocalDate;", "(Ljava/lang/String;ILcom/example/kotlinPractice/domain/enums/ExecutionType;Ljava/time/LocalDate;)V", "getExecutionDate", "()Ljava/time/LocalDate;", "getExecutionType", "()Lcom/example/kotlinPractice/domain/enums/ExecutionType;", "getJob", "()Ljava/lang/String;", "getPriority", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "kotlinPractice"})
public final class PrepInfoDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String job = null;
    private final int priority = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.kotlinPractice.domain.enums.ExecutionType executionType = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate executionDate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto copy(@org.jetbrains.annotations.NotNull
    java.lang.String job, int priority, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.enums.ExecutionType executionType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate executionDate) {
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
    
    public PrepInfoDto(@org.jetbrains.annotations.NotNull
    java.lang.String job, int priority, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.enums.ExecutionType executionType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate executionDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getJob() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPriority() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.enums.ExecutionType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.enums.ExecutionType getExecutionType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getExecutionDate() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlinPractice/feature/prep/api/dto/PrepInfoDto$Companion;", "", "()V", "of", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepInfoDto;", "prep", "Lcom/example/kotlinPractice/domain/entity/Prep;", "kotlinPractice"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto of(@org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.domain.entity.Prep prep) {
            return null;
        }
    }
}