package com.isban.spring.AOP_After_Returning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class RutaOperaciones {
	public void miAviso(JoinPoint jp,Object resultado)//es un aviso
    {  
		System.out.println("funcionalidad adicional");  
		System.out.println("Metodo: "  + jp.getSignature());  
		System.out.println("El resultado es: "+resultado);  
		System.out.println("final de el aviso After-Returning ...");    
  }  
  
}
