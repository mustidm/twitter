package com.class02;

import org.testng.annotations.Test;

public class priorty {
	
	@Test(priority =1)
	public void first() {
		System.out.println("first test annotations");
	}
	
	@Test(priority =2)
	public void second() {
		System.out.println("second test annotations");
	}
	
	@Test(priority =3)
	public void third() {
		System.out.println("third test annotations");
	}
	
	@Test(priority =4)
	public void forth() {
		System.out.println("forth test annotations");
	}

}
