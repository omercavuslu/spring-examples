package com.omercavuslu.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {


    /*
    service paketinin altındaki  MessageService classının mesajVer metodundan önce bu metod çalışsın
    JoinPoint ile de aradaki state e ulaşabiliyoruz
     */
    @Before("execution(* com.omercavuslu.aop.service.MessageService.mesajVer(..))")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint){
        System.out.println("Mesaj Ver Metodundan Önce paramete yakalandı param : "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    /*
    service paketinin altındaki tüm classların tüm metodlarından sonra bu metod çalışsın
    JoinPoint ile de aradaki state e ulaşabiliyoruz
     */
    @After("execution(* com.omercavuslu.aop.service.*.*(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint){
        System.out.println("Mesaj Ver Metodundan sonra paramete yakalandı param : "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
