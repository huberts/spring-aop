package pl.hubiq.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration // <- Weaver & weaving: Spring Framework handling aspects & mechanism of handling aspects
public class UserAccessAspect { // <- Aspect: whole class

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* pl.hubiq.aop.springaop.data.*.*(..))")  // <- Pointcut: list of methods in scope of the aspect
    public void before(JoinPoint joinPoint) { // <- Join point: actual method executed
        logger.info("Check for user access"); // <- Advice: actual code of the aspect
        logger.info("Allowed axecution for {}", joinPoint);
    }
}
