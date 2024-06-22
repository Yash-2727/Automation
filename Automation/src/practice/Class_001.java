package practice;

public class Class_001 {
	public void M1() {
		int a = 10;
		for(a=0;a<=10;a++) {
			System.out.println(a);
		}
	}
	
	public static void M2() {
		int b=10;
		if(b<=9) {
			System.out.println(b);
		}
		else {
			System.out.println("invalid input "+b);
		}
	}

	
	private void M3() {
		System.out.println("private");
	}
	public static void main(String[] args) {
		Class_001 Test= new  Class_001();
		Test.M1();
		M2();
		Test.M3();
		
	}

}
