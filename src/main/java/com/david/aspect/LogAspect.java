package com.david.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: HongBo﹒Liu
 * @date: 2020/1/3 10:40
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.david.service.UserService.*(..))")
    public void pointCut1() {
    }
    @Before("pointCut1()")
    public void before() {
        System.out.println("======before=========");
    }

}
