package private_9;

public class Css_001 {
	public void M1() {
		System.out.println("instance");
	}
	
	public static void M2() {
		System.out.println("static");
		
	}
private void M3() {
	System.out.println("private");
}
	public static void main(String[] args) {
		Css_001 Cs= new Css_001();
		Cs.M3();
		Cs.M1();
		M2();
		
	}

}
