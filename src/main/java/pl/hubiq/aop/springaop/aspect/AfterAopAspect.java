package pl.hubiq.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* pl.hubiq.aop.springaop.business.*.*(..))",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "execution(* pl.hubiq.aop.springaop.business.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("{} returned with value {}", joinPoint, exception);
    }

    @After(
            value = "execution(* pl.hubiq.aop.springaop.business.*.*(..))"
    )
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }
}
