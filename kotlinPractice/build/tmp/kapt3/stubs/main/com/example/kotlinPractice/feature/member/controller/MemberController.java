package com.example.kotlinPractice.feature.member.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0012\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\nH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\nH\u0017J\u001c\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kotlinPractice/feature/member/controller/MemberController;", "", "memberService", "Lcom/example/kotlinPractice/feature/member/api/MemberService;", "(Lcom/example/kotlinPractice/feature/member/api/MemberService;)V", "createMember", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberInfoDto;", "memberCreateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberCreateDto;", "kitchenId", "", "getMember", "targetMemberId", "getMembers", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "removeMember", "", "updateMember", "updateDto", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberUpdateDto;", "kotlinPractice"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/member"})
@org.springframework.web.bind.annotation.RestController
public class MemberController {
    private final com.example.kotlinPractice.feature.member.api.MemberService memberService = null;
    
    public MemberController(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.member.api.MemberService memberService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto createMember(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto memberCreateDto, @org.springframework.web.bind.annotation.RequestParam(value = "kitchenId")
    long kitchenId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/all"})
    public org.springframework.data.domain.Page<com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto> getMembers(@org.jetbrains.annotations.NotNull
    @org.springframework.data.web.PageableDefault(size = 10, sort = {"id"}, direction = org.springframework.data.domain.Sort.Direction.DESC)
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{targetMemberId}"})
    public com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto getMember(@org.springframework.web.bind.annotation.PathVariable
    long targetMemberId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{targetMemberId}"})
    public com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto updateMember(@org.springframework.web.bind.annotation.PathVariable
    long targetMemberId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto updateDto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{targetMemberId}"})
    public void removeMember(@org.springframework.web.bind.annotation.PathVariable
    long targetMemberId) {
    }
}