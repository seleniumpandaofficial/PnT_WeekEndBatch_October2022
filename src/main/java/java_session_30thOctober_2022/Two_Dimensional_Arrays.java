package java_session_30thOctober_2022;

public class Two_Dimensional_Arrays {

	public static void main(String[] args) {
		//Declaration
		
		int[][] a; //please use this way
		
		int[] []a1;
		int a2[][];
		int[] a3[];
		
		
	
		// int[][] a5, []b5; //compile time error
		int [][] a6, b6; // both are 2-D arrays 
		int[] a7[], b7; 
		int[] a8[], b8[]; 
		int[][] a9, b9[]; //a9 is 2-D and b9 is 3-D
		

		
		//Creation
		
		int[][] a10 = new int[2][3];
		
		
		
		//initialize
		
		int[][] a11 = new int[3][4];
		
		a11[0][0] = 101;
		a11[0][1] = 202;
		a11[0][2] = 303;
		a11[0][3] = 404;
		
		a11[1][0] = 101;
		a11[1][1] = 202;
		a11[1][2] = 303;
		a11[1][3] = 404;
		
		
		a11[2][0] = 101;
		a11[2][1] = 202;
		a11[2][2] = 303;
		a11[2][3] = 404;
		
		int[][] a12 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		int[][] a13 = { {1,2,3,4,5,6}, {5,6,7,8,9,10}, {9,10,11,12,13,14} , {14,15,16,17,18,10} , {18,19,20,21,22,23}};
		
		//homework a14
		
		//retrieve
		
		int[][] a15 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		
		for(int row=0 ; row<a15.length ; row++) {
			for(int col=0 ; col<a15[row].length ; col++) {
				System.out.print(a15[row][col] +  " ");
			}
			System.out.println();
		}
		
		
		
	}

}
