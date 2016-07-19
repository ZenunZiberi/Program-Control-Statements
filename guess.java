package ProgramControlStatements;

public class guess {

	public static void main(String[] args) 
	throws java.io.IOException {
		
		char ch, answer = 'K', stupidAnswer = 'D';
		
		System.out.println("Im thinking of a letter bettwen A and Z");
		System.out.println("Can u guess it: ");
		
		ch = (char) System.in.read();
		
		if(ch == answer) 
			System.out.println("***RIGHT***");
		else
		if(ch == stupidAnswer)
			System.out.println("***you are genius");
		do {  System.out.println("do statement");
		while (answer =='K'){
			System.out.println("u dont know nothing");
		}
		
			
		if (ch < stupidAnswer )
			System.out.println("to low");
		else 
			System.out.println("to high");
		
		}while (answer =='K');
}
}