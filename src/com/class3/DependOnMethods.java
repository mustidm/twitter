package com.class3;

import org.testng.annotations.Test;

public class DependOnMethods {
	
	@Test
	public void one() {
		System.out.println("one test ");
	}
	
	@Test(dependsOnMethods="one")
	public void two() {
		System.out.println("two test ");
	}
	
	@Test(dependsOnMethods ="two")
	public void three() {
		System.out.println("three test ");
	}

}