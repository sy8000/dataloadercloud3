package cn.besbing.server.components;

import cn.besbing.server.utils.AbstractLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * AOP切片示例
 */

@Aspect
@Component
public class AopLog extends AbstractLog {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());
    //线程局部变量，用于解决多线程中相同变量的访问冲突问题
    ThreadLocal<Long> startTime = new ThreadLocal<>();
    String className = "";

    //切点
    @Pointcut("execution(public * cn.besbing.server.*.*.*(..))")
    public void aopWebLog() {
    }

    @Before("aopWebLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //开始记录内容
        className = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info("URL:{},HTTP:{},IP:{},CLASS:{},PARAMS:{}", request.getRequestURL(), request.getMethod(), request.getRemoteHost(),className , request.getQueryString());
        /*logger.info("HTTP:{}", request.getMethod());
        logger.info("IP:{}", request.getRemoteHost());
        logger.info("class:{},{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        logger.info("param:{}", request.getQueryString());*/
    }

    @AfterReturning(pointcut = "aopWebLog()", returning = "object")
    public void doAfterReturning(Object object) throws Throwable {
        //logger.info("执行后：");
        logger.info("应答值：{}", object);
        logger.info("{}执行结束，应答值：{},耗时：{}",className, object, System.currentTimeMillis() - startTime.get());
    }

    @AfterThrowing(pointcut = "aopWebLog()", throwing = "e")
    public void addAfterThrowingLogger(JoinPoint joinPoint, Exception e) {
        logger.error("执行{}异常", e.getMessage());
    }


}
