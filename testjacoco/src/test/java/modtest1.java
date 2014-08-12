

import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class modtest1{
  public void selection() {
	  mod test = new mod();
	  String result = test.method1();
	  Assert.assertEquals(result, "Method 1");
	  
  }
}
