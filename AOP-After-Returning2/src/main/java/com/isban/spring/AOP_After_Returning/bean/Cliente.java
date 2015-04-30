package com.isban.spring.AOP_After_Returning.bean;

public interface Cliente {

 
	void setName(String name);
 
	public void setUrl(String url);
	
 
	public String printName();
	
 
	public void printURL();
	
 
	public void printThrowException();
	
	public Integer printAnyo();
}
