package com.example.kotlinPractice.feature.prep.api;

import java.lang.System;

@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kotlinPractice/feature/prep/api/PrepServiceImpl;", "Lcom/example/kotlinPractice/feature/prep/api/PrepService;", "prepRepository", "Lcom/example/kotlinPractice/domain/repository/PrepRepository;", "memberRepository", "Lcom/example/kotlinPractice/domain/repository/MemberRepository;", "prepCustomRepository", "Lcom/example/kotlinPractice/domain/repository/querydsl/PrepCustomRepository;", "(Lcom/example/kotlinPractice/domain/repository/PrepRepository;Lcom/example/kotlinPractice/domain/repository/MemberRepository;Lcom/example/kotlinPractice/domain/repository/querydsl/PrepCustomRepository;)V", "createPrepToTargetMember", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberWithPrepInfoDto;", "targetMemberId", "", "prepCreateDtos", "", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepCreateDto;", "getMemberOrThrow", "Lcom/example/kotlinPractice/domain/entity/Member;", "memberId", "getMyPrep", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepInfoDto;", "updatePrepStatus", "prepId", "kotlinPractice"})
@org.springframework.stereotype.Service
public class PrepServiceImpl implements com.example.kotlinPractice.feature.prep.api.PrepService {
    private final com.example.kotlinPractice.domain.repository.PrepRepository prepRepository = null;
    private final com.example.kotlinPractice.domain.repository.MemberRepository memberRepository = null;
    private final com.example.kotlinPractice.domain.repository.querydsl.PrepCustomRepository prepCustomRepository = null;
    
    public PrepServiceImpl(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.PrepRepository prepRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.MemberRepository memberRepository, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.domain.repository.querydsl.PrepCustomRepository prepCustomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto createPrepToTargetMember(long targetMemberId, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto> prepCreateDtos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto updatePrepStatus(long prepId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto> getMyPrep(long targetMemberId) {
        return null;
    }
    
    private com.example.kotlinPractice.domain.entity.Member getMemberOrThrow(long memberId) {
        return null;
    }
}