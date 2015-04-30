package com.isban.spring.AOP_Around.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class RutaOperaciones {
	public Object miAviso(ProceedingJoinPoint pjp) throws Throwable//es un aviso
    {  
		System.out.println("funcionalidad adicional antes de llamar al metodo actual");  
        Object obj=pjp.proceed();  
        System.out.println("funcionalidad adicional despues de llamar al metodo actual");  
        return obj;  
  }  
  
}
