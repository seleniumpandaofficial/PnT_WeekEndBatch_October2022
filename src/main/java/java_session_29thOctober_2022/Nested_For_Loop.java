package java_session_29thOctober_2022;

public class Nested_For_Loop {

	public static void main(String[] args) {

		// nested for loop - for each execution of outer for loop, inner for loops
		// executes completely

		// pattern programming
		pattern2();
		pattern1();
		pattern3(6);
		pattern4(5);

	}

	static void pattern1() {
		for (int row = 1; row <= 5; row++) {
			
			for (int col = 1; col <= 5; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
	}

	static void pattern2() {
		for (int row = 1; row <= 5; row++) {
			
			for (int col = 1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------------");
	}
	
	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			
			for (int col = 1; col<= n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------------");
	}
	
	static void pattern4(int n) {
		for (int row = 1 ; row <= n ; row++) {
			
			for (int col = 1 ; col<=row ; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------------");
	}
	
	

}
