package regression1;




public class Mod1 {

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
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		Mod1 sam = new Mod1();
		if(a==10)
		sam.method1();
		else if(a==20)
		sam.method2();
		else
		sam.method3();
		System.out.println("End of Exe");
		

	}

}
