package cn.marblog.bwcar.aspcet;

import cn.marblog.bwcar.log.MyLog;
import cn.marblog.bwcar.utils.HttpContextUtils;
import cn.marblog.bwcar.utils.IPUtils;
import com.alibaba.fastjson.JSONObject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
@Aspect
@Component
public class MyLogAdvice {

    @Pointcut("@annotation(cn.marblog.bwcar.log.MyLog)")
    public void myPoint() {

    }

    @AfterReturning(pointcut = "myPoint()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        MyLog annotation = method.getAnnotation(MyLog.class);
        String operation = null;
        if (annotation != null) {
            operation = annotation.value();
        }
        String ip = IPUtils.getIpAddr(HttpContextUtils.getHttpServletRequest());
        Object[] args = joinPoint.getArgs();
        String s = JSONObject.toJSONString(args);

    }
}
