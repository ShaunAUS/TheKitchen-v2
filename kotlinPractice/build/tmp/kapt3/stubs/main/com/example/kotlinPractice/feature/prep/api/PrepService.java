package com.example.kotlinPractice.feature.prep.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lcom/example/kotlinPractice/feature/prep/api/PrepService;", "", "createPrepToTargetMember", "Lcom/example/kotlinPractice/feature/member/api/dto/MemberWithPrepInfoDto;", "targetMemberId", "", "prepCreateDtos", "", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepCreateDto;", "getMyPrep", "Lcom/example/kotlinPractice/feature/prep/api/dto/PrepInfoDto;", "updatePrepStatus", "prepId", "kotlinPractice"})
public abstract interface PrepService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto createPrepToTargetMember(long targetMemberId, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto> prepCreateDtos);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto updatePrepStatus(long prepId);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto> getMyPrep(long targetMemberId);
}