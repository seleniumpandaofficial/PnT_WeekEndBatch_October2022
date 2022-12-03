package java_session_STRINGS_26thNovember_2022;

public class StringOperations_Part1 {

	public static void main(String[] args) {
		
		//1. Determine the length of the String
		String S0 = null;
		//System.out.println(S0.length()); //NullPointerException
		
		String S1 = "I am learning Automation with Java Selenium";
		System.out.println("Length of S1 is : " + S1.length());
		
		//isEmpty() - this method should return true if the String is empty, return false if it is not empty
		String S2 = "";
		System.out.println(S2.isEmpty());
		String S3 = "Hello";
		System.out.println(S3.isEmpty());
		
		//trim() - this method removes the blank spaces before and after the String
		String S4 = "   I am working    ";
		System.out.println(S4.length());
		String trimmedvalue = S4.trim();
		System.out.println(trimmedvalue);
		System.out.println(trimmedvalue.length());
		
		//how to use trim() and length() method together?
		String S5 = "   I am working very hard      ";
		System.out.println(S5.length()); //31
		int trimmedValueThenLength = S5.trim().length(); //length().trim() is not allowed
		System.out.println(trimmedValueThenLength); //22
		
		//Comparing two Strings
		//equals() - returns boolean
		String S6 = "Python";
		String S7 = "Java";
		System.out.println(S6.equals(S7));
		
		//equalsIgnoreCase() - returns boolean
		String S8 = "HelloWORLD";
		String S9 = "helloworlD";
		System.out.println(S8.equalsIgnoreCase(S9));
		
		//compareTo()
		String S10 = "I am going out";
		String S11 = "I am coming home";
		System.out.println(S10.compareTo(S11));
		//https://unicodelookup.com/
		String S12 = "a"; //unicode value is 97
		String S13 = "A"; //unicode value is 65
		System.out.println(S12.compareTo(S13)); //unicode value of a - unicode value of A //97-65 = 32
		
		//compareToIgnoreCase()
		System.out.println(S12.compareToIgnoreCase(S13)); //0
		
		//concat()
		String S14 = "Dummy";
		String S15 = "Value";
		String S16 = S14 + S15;
		System.out.println(S16);
		String S17 = "Horse"; //1 object will be created in the SCP/SLP memory location
		String S18 = S17.concat("White");
		System.out.println(S17);
		System.out.println(S18);
		
		//join()
		String S19 = "Mercedes";
		String S20 = "Jaguar";
		String S21 = "Audi";
		System.out.println(String.join("/", S19, S20, S21));
		
		//substring()
		String S22 = "ToyotaHondaNissan";
		System.out.println(S22.substring(1, 5));
		
		
		
		
		
		
		
	}

}
