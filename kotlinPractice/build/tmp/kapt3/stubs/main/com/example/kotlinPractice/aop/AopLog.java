package com.example.kotlinPractice.aop;

import java.lang.System;

@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0017J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\r\u001a\u00020\bH\u0013J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/kotlinPractice/aop/AopLog;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "afterReturnLog", "", "joinPoint", "Lorg/aspectj/lang/JoinPoint;", "returnObj", "beforeParameterLog", "cut", "getMethod", "Ljava/lang/reflect/Method;", "kotlinPractice"})
@org.springframework.stereotype.Component
@org.aspectj.lang.annotation.Aspect
public class AopLog {
    @org.jetbrains.annotations.NotNull
    private final org.slf4j.Logger logger = null;
    
    public AopLog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.aspectj.lang.annotation.Pointcut(value = "execution(* com.example.kotlinPractice.service..*.*(..))")
    private void cut() {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    @org.aspectj.lang.annotation.Before(value = "cut()")
    public void beforeParameterLog(@org.jetbrains.annotations.NotNull
    org.aspectj.lang.JoinPoint joinPoint) throws java.lang.Throwable {
    }
    
    @org.aspectj.lang.annotation.AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturnLog(@org.jetbrains.annotations.NotNull
    org.aspectj.lang.JoinPoint joinPoint, @org.jetbrains.annotations.Nullable
    java.lang.Object returnObj) {
    }
    
    private java.lang.reflect.Method getMethod(org.aspectj.lang.JoinPoint joinPoint) {
        return null;
    }
}