package regression3;

import regression2.Mod2;



public class Mod3 {
	public String method1()
	{
		
		String result1 ="Method 1";
		return result1;
	
	}
	
	public String method2()
	{
		
		String result2 ="Method 2";
		return result2;
	
	}
	
	public String method3()
	{
		
		String result3 ="Method 3";
		return result3;
	
	
	}
	
	
	public static void main(String args[])
	{
		int a=10;
		Mod3 sam = new Mod3();
		if(a==10)
		sam.method1();
		else if(a==20)
		sam.method2();
		else
		sam.method3();
		System.out.println("End of Exe");
	}
	
}
