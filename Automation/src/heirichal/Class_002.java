package heirichal;

public class Class_002 extends Heirichal {
	public void N1() {
		System.out.println("instance from clss 2 child");
	}
 public static void N2() {
	 System.out.println("static from class 2 child");
 }
	public static void main(String[] args) {
		Heirichal Parent = new Heirichal();
		Parent.X1();
		Class_002 CHILD2 =new Class_002();
		CHILD2.N1();//from child class
		N2();
	}

}
