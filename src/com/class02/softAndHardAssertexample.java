package com.class02;

import org.testng.annotations.BeforeClass;

import utills.CommonMethods;

public class softAndHardAssertexample extends CommonMethods {
@BeforeClass
public void setUP() {
	setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
}
}
