package ProgramControlStatements;

public class Switch {

	public static void main(String[] args) {

      int i;
      
      for (i = 0; i < 9; i++)
    	  switch(i) {
    	  case 0:
    		  System.out.println("i is zero");
    	      break;
    	  case 1:
    		  System.out.println("i is one");
    		  break;
    	  case 2:
    		  System.out.println("i is two");
    		  break;
    	  case 3: 
    		  System.out.println("i is three");
    	  case 4: 
    		  System.out.println("i is four");
    	  case 5:
    		  break;
    	  case 6:
    		  break;
    	  case 7:
    		  
    		  System.out.println("i is 5,6,7...");
    		  break;
    	  default:
    			  System.out.println("i..........");
    			  
    				  
      }
	}

}
