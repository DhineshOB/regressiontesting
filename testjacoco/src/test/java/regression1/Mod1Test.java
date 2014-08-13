package regression1;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import regression2.Mod2;

public class Mod1Test {
  @Test
  public void selection() {
	  System.out.println("Testng Running Mod1Test.......");
	  Mod1 test = new Mod1();
	  String result = test.method1();
	  String result2= test.method2();
	  Assert.assertEquals(result, "Method 1");
	  Assert.assertEquals(result2, "Method 2");
  }
}