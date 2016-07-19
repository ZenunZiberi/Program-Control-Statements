package ProgramControlStatements;

public class test3 {

	public static void main(String[] args) throws java.io.IOException {
		int spaceCounter = 0;
		char input;
		System.out.println("enter");
		input = (char) System.in.read();
	
		do {
			
			if (input == ' ')	spaceCounter++;
		} while (input != '.');
		System.out.println(spaceCounter);
	}
}