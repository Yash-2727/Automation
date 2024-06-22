package heirichal;

public class Class_001 extends Heirichal {
	public void M1() {
		System.out.println("instance from child sub class1");
	}
	public static void M2() {
		System.out.println("static from clss1 ");
	}

	public static void main(String[] args) {
		Heirichal Child = new Class_001();
		Child.X1();
	}

}
