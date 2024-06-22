package practice1;

public class Switch_State {
	  public static void MO() {
		  System.out.println("ask permission");
	  }
	
	public static void main(String[] args) {
		String  i = "yash" ;
	     switch (i) {
	     case "akshay":
	    	 System.out.println(40);
	    	 break;
	     case "yash":
	    	 System.out.println(25);
	    	 break;
	     case "yesh":
	    	 System.out.println(30);
	    	 break;
	      default:
	    	  System.out.println("no case match");
	    	  break;
		

	}

}
}