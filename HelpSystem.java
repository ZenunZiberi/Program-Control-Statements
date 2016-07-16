package ProgramControlStatements;

public class HelpSystem {

	public static void main(String[] args) 

		throws java.io.IOException {
	
		int choise;   //also can use char
		 
		System.out.println("Help on: ");
		System.out.println(" 1. if ");
		System.out.println(" 2. switch ");
		System.out.println("chose one: ");
		choise =(char) System.in.read();
		System.out.println("\n");
		
		switch (choise){
		case '1':
			System.out.println("The if:\n");
			System.out.println("if (condition) statement;");
			System.out.println("else statement;");
			break;
			
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch (expresion) {");
			System.out.println(" case constant:");
			System.out.println("   statement sequence ");
			System.out.println("    break;");
			System.out.println("  //...");
			System.out.println("}");
			break;
			default:
				System.out.println("selection not found");
			
		}
	}

}
