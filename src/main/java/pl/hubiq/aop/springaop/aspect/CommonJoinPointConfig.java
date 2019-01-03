package pl.hubiq.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* pl.hubiq.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* pl.hubiq.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

}
