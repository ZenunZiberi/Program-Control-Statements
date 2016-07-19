package ProgramControlStatements;

public class continueDemo {

	public static void main(String[] args) {

		int i ;
		loop : for (i=0; i<100; i++){
			if ((i==10)) continue loop;
			System.out.println(i);
		}

	}

}
