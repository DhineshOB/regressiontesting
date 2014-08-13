package regression3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import regression2.Mod2;

public class Mod3Test {
  @Test
  public void selection() {
	  System.out.println("Testng Running Mod3Test.......");
	  Mod3 test = new Mod3();
	  String result = test.method1();
	  String result2= test.method2();
	  Assert.assertEquals(result, "Method 1");
	  Assert.assertEquals(result2, "Method 2");
	  
  }
}