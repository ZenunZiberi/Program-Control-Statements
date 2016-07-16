package ProgramControlStatements;

public class KeyboardInput {

	public static void main(String[] args) 
		throws java.io.IOException {
			char ch;
			
			System.out.println("Press a key folowed by enter: ");
			
			 ch = (char ) System.in.read();
			
			System.out.println("ur key is: "+ch);
		}

	}


