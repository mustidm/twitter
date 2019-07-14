package com.class3;

import org.testng.annotations.Test;

public class deneme {
	@Test (groups= {"Ismet","Mustafa"})
	public void bir() {
		System.out.println("bir");
	}
	@Test(groups= "Ismet")
	public void iki() {
		System.out.println("iki");
	}
	@Test(groups="Mustafa")
	public void uc() {
		System.out.println("uc");
	}
	@Test(groups="Mustafa")
	public void dort() {
		System.out.println("dort");
	}
    @Test(groups= "Ismet")
	public void bes() {
		System.out.println("bes");
	}
}
