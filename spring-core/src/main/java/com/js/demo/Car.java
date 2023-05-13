package com.js.demo;

public class Car {
	Engine e;  // dependency injection
	
	public void setE(Engine e) {
		this.e = e;
	}

	public void move() {
		System.out.println("Car is moving"); 
	}

}
