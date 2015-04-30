package com.isban.spring.AOP_Throwing.bean;

public interface Operacion {
	void validate_throw(int age)throws Exception;
	void validate(int age)throws Exception;
}
