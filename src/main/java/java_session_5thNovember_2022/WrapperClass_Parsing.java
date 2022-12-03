package java_session_5thNovember_2022;

public class WrapperClass_Parsing {
	//Parsing - logical form of understanding of how to read the value of one object when it gets converted into another type

	public static void main(String[] args) {
		
		String price1 = "12.98";
		String price2 = "7.70";
		
		// int result = price1 + price2; 
		System.out.println(price1 + price2); //this will just concatenate
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		double sum = p1+p2;
		
		System.out.println(sum);
		
		
		String a = "25";
		String b = "35";
		
		int val1 = Integer.parseInt(a);
		int val2 = Integer.parseInt(b);
		int result = val1+val2;
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		

	}

}
