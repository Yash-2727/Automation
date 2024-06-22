package practice1;

public class IfelsIf_ladder extends Switch_State {
  public void M2() {
	  int i =23;
	  if (i<=12) {
		  System.out.println("Pop-up");
	  }
	 
	  else if(i<23) {
		  System.out.println("true");
	  }
	  else if(i>24) {
		  
		  System.out.println("false");
	  }
	  else {
		  System.out.println("print this");
	  }
  
  }
	public static void main(String[] args) {
		//Is_A Relation
		IfelsIf_ladder State= new IfelsIf_ladder();
		State.M2();
		//Switch_State M5 = new Switch_State();
	      MO();
	}

}
