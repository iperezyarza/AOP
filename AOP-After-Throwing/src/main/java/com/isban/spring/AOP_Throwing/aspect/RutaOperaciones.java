package com.isban.spring.AOP_Throwing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class RutaOperaciones {
	public void miAviso(JoinPoint jp,Throwable error)//it is advice  
    {  
		System.out.println("funcionalidad adicional");  
		System.out.println("Metodo: "  + jp.getSignature());  
		System.out.println("La excepcion es: "+error);  
		System.out.println("final de el aviso despues de lanzar ...");  
  }  
  
}
