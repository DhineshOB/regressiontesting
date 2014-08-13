package regression2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mod2Test {
  @Test
  public void selection() {
	  System.out.println("Testng Running Mod2Test.......");
	  Mod2 test = new Mod2();
	  String result = test.method1();
	  String result2= test.method2();
	  Assert.assertEquals(result, "Method 1");
	  Assert.assertEquals(result2, "Method 2");
  }
}