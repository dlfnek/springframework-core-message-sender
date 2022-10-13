package com.nhnacademy.edu.springframework.messagesender.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class PrintLogging {

//    @Pointcut("execution(* com.nhnacademy.edu.springframework..sendMessage(..))")
//    public void pointcutSource() {}

    @Around("execution(* com.nhnacademy.edu.springframework..sendMessage(..))")
    public Object printLogging(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();

            Object retVal = pjp.proceed();

            return retVal;
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
