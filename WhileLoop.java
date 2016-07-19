package ProgramControlStatements;

public class WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		char ch = 'q';
		
		for (;2>1;ch++){
			
			Thread.sleep(300);
			while (ch == 'a');
			if (ch =='q')
			System.out.println("finly"+ch);
			
			
		}

	}

}
