package com.example.kotlinPractice.domain.repository.querydsl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlinPractice/domain/repository/querydsl/PrepCustomRepository;", "", "findByMemberId", "", "Lcom/example/kotlinPractice/domain/entity/Prep;", "targetMemberId", "", "kotlinPractice"})
public abstract interface PrepCustomRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.kotlinPractice.domain.entity.Prep> findByMemberId(long targetMemberId);
}