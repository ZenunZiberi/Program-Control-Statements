package ProgramControlStatements;

public class ifelseifLadder {

	public static void main(String[] args) {

		int x;
		
		for(x=0; x < 6; x++) {
			if (x ==1 || x == 0)
				System.out.println("x is one");
			else if (x ==2)
				System.out.println("x is two");
			else if  (x == 3)
			System.out.println("x is three");
			else if (x == 4)
				System.out.println("x is four");
			else 
				System.out.println("x is not betwen 1 and 4");
		}
			

	}

}
