package java_session_STRINGS_26thNovember_2022;

public class Immutable {
	
	//Strings are immutable ? YES
	//StringBuffer and StringBuilder are not immutable
	
	//Immutable - this means something which cannot be changed
	//The concept of immutability wrt Strings is around String Objects

	public static void main(String[] args) {
		
		String S1 = new String("Welcome"); //Original 
		S1.concat("Home"); // Which we are trying to change
		System.out.println(S1); //Welcome will be the output
//Whenever we try to change something in the String object, instead of changing it, it creates a new object		
		
		S1 = S1.concat("To Class");
		
		System.out.println(S1); //WelcomeTo Class
		
		
		String Student1 = "Physics";
		String Student2 = "Physics";
		String Student3 = "Chemistry";
		
		String Student1000 = "Physics";

	}

}
