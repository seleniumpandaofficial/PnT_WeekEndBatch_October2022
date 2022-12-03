package java_session_2ndOctober_2022;

public class PrimitiveData_Types {

	public static void main(String[] args) {
		// int

		int i = 1;
		int j = -2;



		int k = 2147483647;
		int l = -2147483648;

		int m = 10; // here the value of m is 10
		m = 11; // I changed the value of m to 11
		m = 12;
		System.out.println(m);
		System.out.println(15);
		
		//a data type will not be accomodating another data type
		
		// int range is -2147483648 to 2147483647 
		//long range is -9223372036854775808 to 9223372036854775807
		// short range is - 32678 to 32677
		

		char c = 'a'; 
		char c1 = ' ';
		char c2 = '#';
		char c3 = 1;
		System.out.println("The value of c3 is: " + c3);
		
		
		boolean b1 = 1<2; //this statement is true
		System.out.println(b1);
		boolean b2 = 191.123 < 192;
		System.out.println(b2);
		
		boolean b3 = true;
		boolean b4 = false;
		boolean b5 = (b3 == b4); //false statement
		System.out.println(b5); 
		
		double d = 1.1;
		System.out.println(d);
		
		
		

	}

}
