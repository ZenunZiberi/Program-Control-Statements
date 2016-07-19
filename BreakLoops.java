package ProgramControlStatements;

public class BreakLoops {

	public static void main(String[] args) 
			throws java.io.IOException	{
			char ch;
			
			for ( ;3>0 ; ch++) {
				ch = (char) System.in.read();
				if (ch == 'q')
				 		break;
				
				System.out.println(ch);
			}
			System.out.println("you pressed q");

	}

}
