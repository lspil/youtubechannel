package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

  // JOINPOINT: @Before, @After, @AfterReturning, @AfterThrowing, @Around

  // JOINPOINT
//  @Before("execution(* controllers.DemoController.doubleValue(..))") // POINTCUT
//  public void before() { // ASPECT
//    System.out.println("HELLO!");
//  }
//
//  @After("execution(* controllers.DemoController.doubleValue(..))") // POINTCUT
//  public void after() { // ASPECT
//    System.out.println("WORLD!");
//  }

  @Around("execution(* controllers.DemoController.doubleValue(..))")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
    Object result = pjp.proceed();

    int x = (int) result;

    return 2*x;
  }
}
