package heirichal;

public class Heirichal {
	
	

	
	
	
    public void X1() {
    	System.out.println(" parent class super clss");
    }
    public static void X2() {
    	System.out.println("static from parent class");
    }
	public static void main(String[] args) {
		Heirichal Y1= new Heirichal();
		Y1.X1();
		X2();
  
	}

}
