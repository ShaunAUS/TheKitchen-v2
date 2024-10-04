package com.example.kotlinPractice.feature.member.api;

import java.lang.System;

@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000eH\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/kotlinPractice/feature/member/api/MemberServiceImpl;", "Lcom/example/kotlinPractice/feature/member/api/MemberService;", "memberRepository", "Lcom/example/kotlinPractice/domain/repository/MemberRepository;", "prepRepository", "Lcom/example/kotlinPractice/domain/repository/PrepRepository;", "kitchenRepository", "Lcom/example/kotlinPractice/domain/repository/KitchenRepository;", "(Lcom/example/kotlinPractice/domain/repository/MemberRepository;Lcom/example/kotlinPractice/domain/repository/PrepRepository;Lcom/example/kotlinPractice/domain/repository/KitchenRepository;)V", "createMember", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto;", "memberCreateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberCreateDto;", "kitchenId", "", "getKitchenById", "Lcom/example/kotlinPractice/domain/entity/Kitchen;", "getMember", "memberId", "getMemberOrThrow", "Lcom/example/kotlinPractice/domain/entity/Member;", "getMembers", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "removeMember", "", "targetMemberId", "updateMember", "updateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberUpdateDto;", "kotlinPractice"})
@org.springframework.stereotype.Service
public class MemberServiceImpl implements com.example.kotlinPractice.feature.member.api.MemberService {
    private final com.example.kotlinPractice.domain.repository.MemberRepository memberRepository = null;
    private final com.example.kotlinPractice.domain.repository.PrepRepository prepRepository = null;
    private final com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository = null;
    
    public MemberServiceImpl(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.MemberRepository memberRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.PrepRepository prepRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.KitchenRepository kitchenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto createMember(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto memberCreateDto, long kitchenId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto getMember(long memberId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.springframework.data.domain.Page<com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto> getMembers(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto updateMember(long targetMemberId, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto updateDto) {
        return null;
    }
    
    @java.lang.Override
    public void removeMember(long targetMemberId) {
    }
    
    private com.example.kotlinPractice.domain.entity.Member getMemberOrThrow(long memberId) {
        return null;
    }
    
    private com.example.kotlinPractice.domain.entity.Kitchen getKitchenById(long kitchenId) {
        return null;
    }
}