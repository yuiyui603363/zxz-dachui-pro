package com.dachui.zxzdachuipro.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: zxz
 * @Date: 2024-06-25-14:51
 * @Description:
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.dachui.zxzdachuipro.cd.CD.play(..))")
    public void play(){}

//    @Before("play()")
//    public void beQuiet(){
//        System.out.println("audience be quiet...");
//    }
//
//    @Before("play()")
//    public void openEar(){
//        System.out.println("open ear...");
//    }
//
//    @AfterReturning("play()")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("play()")
//    public void ohno(){
//        System.out.println("oh no");
//    }

    @Around("play()")
    public Object aroud(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("audience be quiet...");
            System.out.println("open ear...");
            result = joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable e){
            System.out.println("oh no");
        }
        return result;
    }
}
