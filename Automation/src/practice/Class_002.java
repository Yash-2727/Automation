package practice;
public class Class_002 {
	
	int i = 9;
	
   static  {
		 System.out.println("static block");
	 }
	
	
	
	public static void ask(long l) {
		Class_002 Y = new Class_002();
		System.out.println(Y.i);
		System.out.println("Static method");
		System.out.println("single para");
	}
	public static void P(long l, int b) {
		System.out.println("staic parameterised method ");
		System.out.println("two para");
	}
	
	public void P() {
		System.out.println("NON Parameter");
	}
	public void P(int a)
	{
		System.out.println("ONE Parameter");
	}
	public void P (int b, int c  ) {
		System.out.println("Two Parameter");
	}
	public void Para(int a, int b , int c ) {
		System.out.println("Parameterised Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
  
	public static void main(String[] args) {
		//Is-A Relationship
		Class_002 X = new Class_002();
		//X.M1();
		X.Para(5, 8, 9);
	//	Has-A Relationship
		Class_001 Y = new Class_001();
		//M2();
		Y.M1();
		X.P();
		X.P(11);
		X.P(12, 13);
		P(9987546l,8);
		P(15L, 54);
	//	L();
		Class_001.M2();
		//Class_001.X2();
		Class_001 obj = new Class_001();
		obj.M1();
	
	}

}
