package com.myshop.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.myshop.model.TestModel;

//@Aspect
//@Component
public class ControllerMonitor {
	
//	@Pointcut("execution(public *  com.myshop.controller..*.*(..))")
//	public void params(){
//		System.out.println("===========");
//	}
	
//	@Before("execution(public *  com.myshop.controller..*.*(..))")
    public void beforeCheckToken(JoinPoint joinPoint){
		System.out.println("调用方法之前。。。。"+joinPoint.getSignature());
//        for(Object obj : joinPoint.getArgs()){
//        	
////        	if(obj instanceof TestModel){
////        		System.out.println(((TestModel) obj).getName());
////        		((TestModel) obj).setAge(22L);
////        	}
//        	System.out.println("==obj=="+obj);
//        	
//        }
        
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes())
				.getRequest();
        System.out.println("==id=="+request.getParameter("id"));
        request.setAttribute("age", 33333333);
        
        System.out.println("==getDeclaringTypeName=="+joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("==getTarget=="+joinPoint.getTarget());
    }
	
}
