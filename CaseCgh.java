package ProgramControlStatements;

public class CaseCgh {

	public static void main(String[] args) throws java.io.IOException {

		char ch;
		int changes = 0;

		do {
			ch = (char) System.in.read();
			
		
			while (ch >= 'a' && ch <= 'z') {
				System.out.println(ch);
				ch ++;
				changes++;
			}
//				else if (ch >= 'A' && ch <= 'Z') {
//				ch -= 32;
//				changes++;
//				System.out.println(ch);
//
//			}
		} while (ch != 'z');
		System.out.println("Case changes: " + changes);
	}
}

