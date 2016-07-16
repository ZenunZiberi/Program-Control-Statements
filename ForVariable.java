package ProgramControlStatements;

public class ForVariable {

	public static void main(String[] args) {
		int sum = 0, fact = 1;
		
		for (int i=0; i<=5; i++){
			sum =sum+ i;      //  sum += i;
			fact =fact* i;    //  fact*= i;
		}
		System.out.println("sum is "+sum);
		System.out.println("factorial is "+fact);
	}

}
