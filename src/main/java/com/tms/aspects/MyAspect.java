package com.tms.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(void *My*())")
    public void myRegexPointcut(){}

    //Pointcut - места к которым будет применяться аспект
    //@Pointcut("within(com.tms.User)") // описываем путь package
    //@Pointcut("@annotation(com.tms.aspects.LogAop)") // описываем аннотацию
    //@Pointcut("execution(void *My*())") // описываем сигнатуру метода
    @Before("myRegexPointcut()") //Advice + Pointcut
    public void printBefore(JoinPoint jp) {
        System.out.println("JoinPoint Before :" + jp.getSignature());
        System.out.println("AspectBefore method");
    }

    @After("myRegexPointcut()") //Advice + Pointcut
    public void printAfter() {
        System.out.println("AspectAfter method");
    }

    @AfterThrowing(value = "myRegexPointcut()", throwing = "err") //Advice + Pointcut
    public void printAfterThrowing(ArithmeticException err) {
        System.out.println("Aspect ArithmeticException method: " + err.toString());
    }

    @AfterReturning(value = "myRegexPointcut()", returning = "result") //Advice + Pointcut
    public void printAfterReturning(Object result) {
        System.out.println("Aspect AfterReturning method: " + result);
    }

    @Around(value = "myRegexPointcut()")
    public Object printAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around method start");
        Object result = joinPoint.proceed();
        System.out.println("Around method end");
        return result;
    }

}
//TODO: @Annotation, проблемы AOP(вложенные методы), принцип работы

