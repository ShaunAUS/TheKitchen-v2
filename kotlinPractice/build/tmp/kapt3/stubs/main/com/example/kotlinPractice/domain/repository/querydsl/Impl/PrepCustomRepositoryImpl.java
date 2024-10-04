package com.example.kotlinPractice.domain.repository.querydsl.Impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/kotlinPractice/domain/repository/querydsl/Impl/PrepCustomRepositoryImpl;", "Lcom/example/kotlinPractice/domain/repository/querydsl/PrepCustomRepository;", "queryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "findByMemberId", "", "Lcom/example/kotlinPractice/domain/entity/Prep;", "targetMemberId", "", "kotlinPractice"})
@org.springframework.stereotype.Repository
public class PrepCustomRepositoryImpl implements com.example.kotlinPractice.domain.repository.querydsl.PrepCustomRepository {
    private final com.querydsl.jpa.impl.JPAQueryFactory queryFactory = null;
    
    public PrepCustomRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.querydsl.jpa.impl.JPAQueryFactory queryFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.example.kotlinPractice.domain.entity.Prep> findByMemberId(long targetMemberId) {
        return null;
    }
}