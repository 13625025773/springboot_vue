package com.example.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.example.aop.service.*.*(..))")
    public void pcl(){}

    @Before(value = "pcl()")
    public void before(JoinPoint jp){
        String name=jp.getSignature().getName();
        System.out.println(name+"before方法开始执行...");
    }
    @After(value = "pcl()")
    public void after(JoinPoint jp){
        String name=jp.getSignature().getName();
        System.out.println(name+"after方法开始执行...");
    }

    @AfterReturning(value = "pcl()",returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        String name=jp.getSignature().getName();
        System.out.println(name+"afterReturning方法开始执行..."+result);
    }

    @AfterThrowing(value = "pcl()",throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e){
        String name=jp.getSignature().getName();
        System.out.println(name+"afterThrowing方法抛异常了,异常是:"+e.getMessage());
    }

    @Around(value = "pcl()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        return pjp.proceed();
    }

}
