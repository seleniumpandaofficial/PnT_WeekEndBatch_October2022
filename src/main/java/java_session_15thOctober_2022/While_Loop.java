package java_session_15thOctober_2022;

public class While_Loop {

	// while loop is mostly used for infinite kind of a situation
	//while is repeated if statement

	public static void main(String[] args) {
		
	
		
		
		/*
		 * int i = 10; //latest value of i is 10 while(i <= 11) { //10 < 11 (true)
		 * System.out.println("Print the value of i : " + i); //here i is still 10
		 * 
		 * i++; // i becomes 11 }
		 */
		
		//WAP to print 1st 50 natural numbers using while loop
		
		/*
		 * int j = 1; while(j<=50) { System.out.print(j + " "); j = j+1; }
		 */
		
		
		//WAP to print first 100 multiple of 5 and add those multiples
		//5, 10, 15..............................500
		//5 + 10 + ................................+ 500 = value
		
		int k = 5;
		int sum = 0;
		while (k <= 5*100) {
			System.out.print(k + " ");
			sum = sum+k; //sum = 0 + 5 + 10 + 15 + 20 + 25
			k=k+5;	
		}
		System.out.println();
		System.out.println("Final sum is : " + sum);
		

	}

}
