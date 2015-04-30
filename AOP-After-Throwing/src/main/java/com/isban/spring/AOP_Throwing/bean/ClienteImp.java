package com.isban.spring.AOP_Throwing.bean;

public class ClienteImp implements Cliente{
	private String name="Iñaki";
	private String url="www.miWEb.html";
	private Integer anyo=2015;
 
	
	public Integer getAnyo() {
		return anyo;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	public void setUrl(String url) {
		this.url = url;
	}
 
	public void printName() {
		System.out.println("Nombre cliente: " + this.name);
	}
 
	public void printURL() {
		System.out.println("website cliente: " + this.url);
	}
 
	public void printAnyo() {
		if(this.anyo>2014){
			throw new IllegalArgumentException();
		}else{
			System.out.println("año cliente: " + this.anyo);
		}
		
	}
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
 
}
