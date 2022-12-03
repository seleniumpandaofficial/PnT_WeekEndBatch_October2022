package java_session_STRINGS_26thNovember_2022;

public class String_vs_CharArray_GarbageCollection {
	
	//Garbage Collection in java 

	public static void main(String[] args) {
		
		String password = new String("Password#9876");
		
		char[] chpassword = new char[] {'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '#', '9', '8', '7', '6'};
		
		System.out.println("The password in the String object is :" + password);
		System.out.println("The password in the Char Array is :" + chpassword);
		
		//Reasons to use Char Array over Strings to store passwords
		//1. Garbage collection does not apply on Strings
		//2. Encoded value in Char Array but String passwords can be retrieved as it is
		

	}

}
