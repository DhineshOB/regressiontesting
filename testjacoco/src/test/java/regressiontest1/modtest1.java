package regressiontest1;


import org.testng.Assert;
import org.testng.annotations.Test;

import regressiontest3.mod3;



@Test
public class modtest1{
  public void selection() {
	  mod3 test = new mod3();
	  String result = test.method1();
	  Assert.assertEquals(result, "Method 1");
	  
  }
}
