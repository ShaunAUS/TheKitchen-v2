package com.example.kotlinPractice.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u001e\u001a\u00020\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Prep;", "", "job", "", "deadLine", "Ljava/time/LocalDate;", "executionStatus", "", "priority", "member", "Lcom/example/kotlinPractice/domain/entity/Member;", "id", "", "(Ljava/lang/String;Ljava/time/LocalDate;IILcom/example/kotlinPractice/domain/entity/Member;Ljava/lang/Long;)V", "getDeadLine", "()Ljava/time/LocalDate;", "getExecutionStatus", "()I", "setExecutionStatus", "(I)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getJob", "()Ljava/lang/String;", "getMember", "()Lcom/example/kotlinPractice/domain/entity/Member;", "setMember", "(Lcom/example/kotlinPractice/domain/entity/Member;)V", "getPriority", "updatePrepStatus", "", "Companion", "kotlinPractice"})
@jakarta.persistence.Entity
public final class Prep {
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private final java.lang.String job = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private final java.time.LocalDate deadLine = null;
    @jakarta.persistence.Column(nullable = false)
    private int executionStatus;
    @jakarta.persistence.Column(nullable = false)
    private final int priority = 0;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.JoinColumn(name = "member_id")
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    private com.example.kotlinPractice.domain.entity.Member member;
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlinPractice.domain.entity.Prep.Companion Companion = null;
    
    public Prep(@org.jetbrains.annotations.NotNull
    java.lang.String job, @org.jetbrains.annotations.NotNull
    java.time.LocalDate deadLine, int executionStatus, int priority, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Member member, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getDeadLine() {
        return null;
    }
    
    public final int getExecutionStatus() {
        return 0;
    }
    
    public final void setExecutionStatus(int p0) {
    }
    
    public final int getPriority() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.entity.Member getMember() {
        return null;
    }
    
    public final void setMember(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Member p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void updatePrepStatus() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Prep$Companion;", "", "()V", "of", "Lcom/example/kotlinPractice/domain/entity/Prep;", "prepCreateDto", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepCreateDto;", "targetMember", "Lcom/example/kotlinPractice/domain/entity/Member;", "kotlinPractice"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinPractice.domain.entity.Prep of(@org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto prepCreateDto, @org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.domain.entity.Member targetMember) {
            return null;
        }
    }
}