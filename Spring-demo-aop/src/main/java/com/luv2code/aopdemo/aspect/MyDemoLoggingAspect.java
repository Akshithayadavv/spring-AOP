package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //this is where we add all of our related advices for logging

    //lets start with an @Before advice

    //@Before("execution(public void add*())")

    //@Before("execution(* add*(com.luv2code.aopdemo.Account,..))")

    //@Before("execution(* add*(..))")

    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice(){

        System.out.println("\n====>>> Executing @Before advice on method");

    }
}

