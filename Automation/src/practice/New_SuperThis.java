package practice;

public class New_SuperThis extends New_class {
	
	
     public void M1() {
    	 super.men();//can call static method 
    	 this.M1();
    	
    	 super.M3(5, 6, 7);
    	 System.out.println(this.a);
    	 System.out.println(this.b);
    	 System.out.println(this.E);
     }
     public static void TEST(){
    	 System.out.println();
     }
	public static void main(String[] args) {
		
		New_SuperThis M2= new New_SuperThis();
		M2.M1();
		
		
	}

}
