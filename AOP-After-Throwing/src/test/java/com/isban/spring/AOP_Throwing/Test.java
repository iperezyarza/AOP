package com.isban.spring.AOP_Throwing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isban.spring.AOP_Throwing.bean.Cliente;
import com.isban.spring.AOP_Throwing.bean.Operacion;

public class Test{  
    public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("com/isban/spring/AOP_Throwing/config/spring-context.xml");  
        
        /*Operacion operacion = (Operacion) context.getBean("operacion");  
        System.out.println("calling validate 19...");  
	        try{  
	        	operacion.validate(19);
	        }catch(Exception e){
	        	System.out.println(e);}  
	        System.out.println("calling validate again...");  
	          
	        try{  
	        	//Comentando y descomentando las lineas 27 y 32 vemos la diferencia
	        	/*la siguiente linea no llama a el aspect porque en aop:pointcut
	        	le he indicado que solo intercepte el metodo validate_throw
	        	
	        	operacion.validate(15);  
	        	System.out.println("*************");
	        	/*la siguiente linea SI llama a el aspect porque en aop:pointcut
	        	le he indicado que solo intercepte el metodo validate_throw
	        	
	        	//operacion.validate_throw(15); 
	        }catch(Exception e){System.out.println(e);}  
	    }  
*/
        Cliente cliente = (Cliente) context.getBean("cliente"); 
        
        System.out.println("*************************");
        cliente.printName();
		System.out.println("*************************");
		cliente.printURL();
		System.out.println("*************************");
		try {
			cliente.printAnyo();
		} catch (Exception e1) {
			
		}
		
		try {
			cliente.printThrowException();
		} catch (Exception e) {
 
		}
    }
}
