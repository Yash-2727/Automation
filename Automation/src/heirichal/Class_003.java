package heirichal;

public class Class_003 extends Heirichal {
	public void O1() {
		System.out.println("instance from child 3");
	}
	public static void O2() {
		System.out.println("static from child 3");
	}

	public static void main(String[] args) {
		Class_003  Z1= new Class_003();
		Z1.O1();
		O2();
		Z1.X1(); //from parent 
		
		
		}

}
