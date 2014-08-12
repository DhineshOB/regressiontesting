

import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class modtest2 {
  public void selection() {
	  mod test = new mod();
	  String result = test.method1();
	  String result2= test.method2();
	  Assert.assertEquals(result, "Method 1");
	 // Assert.assertEquals(result, "Method 2");
	  
  }
}
