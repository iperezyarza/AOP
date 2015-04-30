package com.isban.spring.AOP_After_Returning.bean;

public class ClienteImp implements Cliente{
	private String name="Iñaki";
	private String url="www.miWEb.html";
	private Integer anyo=2014;
 
	
	public Integer getAnyo() {
		System.out.println("año cliente: " + this.anyo);
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
 
	public String printName() {
		System.out.println("Nombre cliente: " + this.name);
		return this.name;
	}
 
	public void printURL() {
		System.out.println("website cliente: " + this.url);
	}
 
	public Integer printAnyo() {
		if(this.anyo>2014){
			throw new IllegalArgumentException();
		}else{
			System.out.println("año cliente: " + this.anyo);
			return this.anyo;
		}
		
	}
	public void printThrowException() {
		System.out.println("pasa por printThrowException ");
		throw new IllegalArgumentException();
	}
 
}
