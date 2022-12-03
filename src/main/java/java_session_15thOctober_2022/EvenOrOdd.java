package java_session_15thOctober_2022;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num = 22;

		int year = 3221;

		// WAP to determine whether this number is even or odd

		// WAP to determine whether this number is a prime number or not - use for loop

		// WAP to determine whether this year is leap year or not
		
		if(num%2 == 0) {
			System.out.println("num is an even number : " + num);
		} else if(num%2 != 0) {
			System.out.println("num is an odd number : " + num);
		}else {
			System.out.println("Nothing works");
		}
		
		
		/*
		 * if(num%num == 0 && num%1 == 0) { System.out.println("num is prime : " + num);
		 * }else { System.out.println("num is not prime : " + num); }
		 */
		
		//a leap year has to be evenly divisible by 4
		//it is divisible by 4, 100 and 400 
		//technically a leap year has to be evenly divisible by 4 and 400
		
		if(year%4 ==0 && year%100 == 0 || year%400 ==0) {
			System.out.println("year is a leap year : " + year);
		}else {
			System.out.println("not a leap year : " + year );
		}
	}

}
