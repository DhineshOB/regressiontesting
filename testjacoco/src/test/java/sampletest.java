

import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class sampletest {
  public void selection() {
	  System.out.println("Hello Testng");
	  sample test = new sample();
	  String result = test.method1();
	  Assert.assertEquals(result, "Method 1");
	  
  }
}