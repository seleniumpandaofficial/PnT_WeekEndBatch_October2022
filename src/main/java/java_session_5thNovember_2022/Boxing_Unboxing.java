package java_session_5thNovember_2022;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		
		//Boxing (do this manually)   - conversion of primitive to Wrapper Class Object
		
		int x=20;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//Autoboxing
		
		int a = 100;
		Integer b = a;
		System.out.println(b);
		
		 
		//Unboxing       - conversion of Wrapper Class object to primitive
		
		Integer result = 50;
		int newResult = result.intValue();
		System.out.println(newResult);
		
		//Autounboxing
		Integer marks = 90;
		int newMarks = marks;
		System.out.println(newMarks);

	}

}
