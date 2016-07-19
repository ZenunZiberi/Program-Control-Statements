package ProgramControlStatements;

public class Guess2 {

	public static void main(String[] args) 
	throws java.io.IOException {
		char ch, ignore, answer = 'K';
		
		do { 
			System.out.println("im thinking of a letter from a to z");
			System.out.println("can u guess it: ");
			
			ch =(char) System.in.read();
			do {
				ignore = (char) System.in.read(); 
			} while (ignore != '\n');
			
			if (ch == answer)		System.out.println("***right***");
			else {
				System.out.println("sorry you are");
				if (ch <answer) System.out.println("to low");
				else System.out.println("to high");
				System.out.println("try again!\n");
			}
		}   while(answer !=ch);
	}
   }
   