package com.isban.spring.AOP_After_Returning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isban.spring.AOP_After_Returning.bean.Cliente;


public class Test{  
    public static void main(String[] args){  
        ApplicationContext context = 
        new ClassPathXmlApplicationContext("com/isban/spring/AOP_After_Returning/config/spring-context.xml");  
        
       Cliente cliente = (Cliente) context.getBean("cliente"); 
        
        System.out.println("**** llamada a printName  ****");
        cliente.printName();
		System.out.println("*****llamada a printURL ****");
		cliente.printURL();
		System.out.println("***** llamada a printAnyo ****");
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
