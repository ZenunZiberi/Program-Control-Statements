package ProgramControlStatements;

public class DoWhileLoop {

	public static void main(String[] args) 
			throws java.io.IOException 	{
		char ch;
		
		do { 
			System.out.println("press a key followed by enter: ");
			ch = (char) System.in.read();  //get a char
		} while (ch <= 'q');
   
		

	}

}
