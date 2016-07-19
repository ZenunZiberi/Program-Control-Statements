package ProgramControlStatements;

public class Break3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("outer loop count: " + i);
			System.out.print("           inner loop count ");
			
			for (int t = 100; t> 1;t--) {
				if (t == 50) break ;
					System.out.print(t + " ");
				
			}
			System.out.println();
		}
		System.out.println("loops complete");
	}

}
