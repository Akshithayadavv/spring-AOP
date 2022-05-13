package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class MyDemoLoggingAspect {


    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){

        System.out.println("\n====>>> Executing @Before advice on method");

    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("\n====>> Performing API analytics");
    }
}

