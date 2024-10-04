package com.example.kotlinPractice.feature.prep.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\tH\u0017J\"\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/kotlinPractice/feature/prep/controller/PrepController;", "", "prepService", "Lcom/example/kotlinPractice/feature/prep/api/PrepService;", "(Lcom/example/kotlinPractice/feature/prep/api/PrepService;)V", "checkMyPrep", "", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepInfoDto;", "targetMemberId", "", "finishPrep", "prepId", "makePrep", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberWithPrepInfoDto;", "prepCreateDtos", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepCreateDto;", "kotlinPractice"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/prep"})
@org.springframework.web.bind.annotation.RestController
public class PrepController {
    private final com.example.kotlinPractice.feature.prep.api.PrepService prepService = null;
    
    public PrepController(@org.jetbrains.annotations.NotNull
    com.example.kotlinPractice.feature.prep.api.PrepService prepService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto makePrep(@org.springframework.web.bind.annotation.RequestParam
    long targetMemberId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    java.util.List<com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto> prepCreateDtos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{prepId}"})
    public com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto finishPrep(@org.springframework.web.bind.annotation.PathVariable
    long prepId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/my"})
    public java.util.List<com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto> checkMyPrep(@org.springframework.web.bind.annotation.RequestParam
    long targetMemberId) {
        return null;
    }
}