package com.isban.spring.AOP_Throwing.bean;

public  class OperacionImp implements Operacion{  
	
	public void validate(int age)throws Exception{  
	    
		if(age<18){  
		        throw new ArithmeticException("Not valid age");  
		        
		    }  
		    else{  
		        System.out.println("Thanks for vote");  
		    }  
	}
	
	public void validate_throw(int age)throws Exception{  
		if(age<18){  
		        throw new ArithmeticException("Not valid age throw");  
		    }  
		    else{  
		        System.out.println("Thanks for vote throw");  
		    }  
	    
	}
}  
