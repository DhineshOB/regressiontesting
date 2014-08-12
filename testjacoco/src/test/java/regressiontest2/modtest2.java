package regressiontest2;


import org.testng.Assert;
import org.testng.annotations.Test;

import regressiontest3.mod3;



@Test
public class modtest2 {
  public void selection() {
	  mod3 test = new mod3();
	  String result = test.method1();
	  String result2= test.method2();
	  Assert.assertEquals(result, "Method 1");
	  Assert.assertEquals(result, "Method 2");
	  
  }
}
