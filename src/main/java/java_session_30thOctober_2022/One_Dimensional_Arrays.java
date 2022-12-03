package java_session_30thOctober_2022;

public class One_Dimensional_Arrays {

	public static void main(String[] args) {
		//Declaration
		 int[] a; //this is the most popular form of writing arrays
		 int a1[];
		 int []a2;
		 int[]a3; 
		 
		 //[] this dimension if declared before a variable and comma is used and another variable is declared - the both variables can use this dimension
		 //[] this dimension if declared after a variable and comma is used, then the other variable cannot use this dimension
		 
		 int[] a4, b4; // both a4 and b4 are 1-D arrays
		 int []a5,b5;  //both a5 and b5 are 1-D arrays
		 int[]a7,b7; //both a7 and b7 are 1-D arrays
		 int a6[], b6; //a6 is a 1-D array but b6 is just an int variable 
		 
		
		 
		
		 //Creation
		 
		 int[] a8 = new int[3];
		 int[] a9 = new int[0];
		 
		 
		 System.out.println(a9.length);
		 
		// int[] a10 = new int[-1];  //NegativeArraySizeException
		// System.out.println(a10.length);
		
		
		
		//Initialization - you put some values in those memory spaces
		 
		 int[] a11 = new int[4];
		 a11[0] = 123;
		 a11[1] = 124;
		 a11[2] = 125;
		 a11[3] = 126;
		
		 
		 //a11[4] = 127; //ArrayIndexOutOfBoundsException
		 
		 System.out.println(a11.length); 
		 
		 
		int[] a12 = {12, 13, 14, 15, 16};
		System.out.println(a12.length);
		
		int[] a13 = new int[]{10, 20, 30, 40, 50, 60};
		System.out.println(a13.length);
		
		
		//Retrieve
		
		
		int[] a14 = {999, 888, 777, 666, 555, 444, 333, 222, 111};
		
		//How will I print all the values in my output console ???
		
		for(int i=0; i<a14.length ; i++) {
			
			System.out.print(a14[i] + " ");
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
