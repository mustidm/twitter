package com.com.class4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
  @Test
  public void f1() {
	  System.out.println("Im f1 test");
  }
  
  @Test
  public void f2() {
	  System.out.println("Im f2 test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im afterXlass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Im afterTest");
  }

}
