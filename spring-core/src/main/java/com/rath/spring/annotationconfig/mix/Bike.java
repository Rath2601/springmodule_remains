package com.rath.spring.annotationconfig.mix;

import org.springframework.stereotype.Component;


public class Bike implements Vehicle {

	@Override
	public void move() {
		System.out.println("Bike moved");
	}

}
