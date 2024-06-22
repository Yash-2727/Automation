package private_9;

public class Css_002 extends Css_001 {
	public void M4() {
		System.out.println("Instance child ");
	}
    public void M4(int i) {
    	System.out.println(i);
    }
    public static void M4(int i,int b) {
    	System.out.println(i);
    	System.out.println(b);
    }
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Css_001 BC = new Css_001();
		BC.M1();
		M2();
		Css_002 Ask = new Css_002();
		Ask.M1();
		Ask.M4();
		Css_001 WER= new Css_002();
		WER.M1();
		Ask.M4();
		Ask.M4(540);
		M4(50, 548);
		
		
		
	}

}
