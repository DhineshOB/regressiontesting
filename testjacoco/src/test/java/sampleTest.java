

import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class sampleTest {
  public void selection() {
	  System.out.println("Hello Testng");
	  sample test = new sample();
	  String result = test.method1();
	  String result2= test.method2();
	  Assert.assertEquals(result, "Method 1");
	  Assert.assertEquals(result, "Method 2");
	  
  }
}
