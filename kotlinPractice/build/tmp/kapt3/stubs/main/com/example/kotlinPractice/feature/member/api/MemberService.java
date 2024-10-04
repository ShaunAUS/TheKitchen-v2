package com.example.kotlinPractice.feature.member.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lcom/example/kotlinPractice/feature/member/api/MemberService;", "", "createMember", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto;", "memberCreateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberCreateDto;", "kitchenId", "", "getMember", "targetMemberId", "getMembers", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "removeMember", "", "updateMember", "updateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberUpdateDto;", "kotlinPractice"})
public abstract interface MemberService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto createMember(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto memberCreateDto, long kitchenId);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.data.domain.Page<com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto> getMembers(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto updateMember(long targetMemberId, @org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto updateDto);
    
    public abstract void removeMember(long targetMemberId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto getMember(long targetMemberId);
}