package com.example.kotlinPractice.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\'\u001a\u00020(2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Member;", "", "name", "", "level", "", "section", "experience", "kitchen", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "preps", "", "Lcom/example/kotlinPractice/domain/entity/Prep;", "id", "", "(Ljava/lang/String;IIILcom/example/kotlinPractice/domain/entity/Kitchen;Ljava/util/List;Ljava/lang/Long;)V", "getExperience", "()I", "setExperience", "(I)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getKitchen", "()Lcom/example/kotlinPractice/domain/entity/Kitchen;", "setKitchen", "(Lcom/example/kotlinPractice/domain/entity/Kitchen;)V", "getLevel", "setLevel", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPreps", "()Ljava/util/List;", "getSection", "setSection", "setupKitchen", "", "update", "updateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberUpdateDto;", "Companion", "kotlinPractice"})
@jakarta.persistence.Entity
public final class Member {
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(nullable = false)
    private java.lang.String name;
    @jakarta.persistence.Column(nullable = false)
    private int level;
    @jakarta.persistence.Column(nullable = false)
    private int section;
    @jakarta.persistence.Column(nullable = false)
    private int experience;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.JoinColumn(name = "kitchen_id")
    @jakarta.persistence.ManyToOne
    private com.example.kotlinPractice.domain.entity.Kitchen kitchen;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.OneToMany(mappedBy = "member", orphanRemoval = true)
    private final java.util.List<com.example.kotlinPractice.domain.entity.Prep> preps = null;
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlinPractice.domain.entity.Member.Companion Companion = null;
    
    public Member(@org.jetbrains.annotations.NotNull
    java.lang.String name, int level, int section, int experience, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Kitchen kitchen, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.kotlinPractice.domain.entity.Prep> preps, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getLevel() {
        return 0;
    }
    
    public final void setLevel(int p0) {
    }
    
    public final int getSection() {
        return 0;
    }
    
    public final void setSection(int p0) {
    }
    
    public final int getExperience() {
        return 0;
    }
    
    public final void setExperience(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlinPractice.domain.entity.Kitchen getKitchen() {
        return null;
    }
    
    public final void setKitchen(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Kitchen p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.kotlinPractice.domain.entity.Prep> getPreps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto updateDto) {
    }
    
    public final void setupKitchen(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.entity.Kitchen kitchen) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinPractice/domain/entity/Member$Companion;", "", "()V", "of", "Lcom/example/kotlinPractice/domain/entity/Member;", "memberCreateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberCreateDto;", "kitchen", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "kotlinPractice"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinPractice.domain.entity.Member of(@org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto memberCreateDto, @org.jetbrains.annotations.NotNull
        com.example.kotlinPractice.domain.entity.Kitchen kitchen) {
            return null;
        }
    }
}