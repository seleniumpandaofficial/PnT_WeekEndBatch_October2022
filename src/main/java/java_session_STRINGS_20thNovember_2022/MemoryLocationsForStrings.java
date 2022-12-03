package java_session_STRINGS_20thNovember_2022;

public class MemoryLocationsForStrings {
	
	//Strings are basically stored in Heap Memory
	
	//There are 5 types of memory storage areas in Java
	//1. Heap Area [String Constant Pool / String Literal Pool] (Manipulate size)
	//2. Method Area
	//3. Stack Area
	//4. Native MethodArea
	//5. PC Register

	public static void main(String[] args) {
		
		String S1 = new String(); //this is also a String Object
		String S2 = "Python"; //this is also a String Object
		String S3 = new String("Java"); 
		
		//whenever we use new keyword to create an object, it is stored in Heap Area
		
		//when you write String S2 = "Python"; 
		
		//String S3 = new String("Java"); 
		//new keyword is there - so object will be created in heap area
		//literal ("Java") is also there - so another object will be created in SLP/SCP area
		
		System.out.println("*********************************************************************");
		
		
		
		String S4 = new String("America");
		//2 objects created - 1 in HA, 1 in SLP
		
		String S5 = new String("Brazil");
		//2 objects created - 1 in HA, i in SLP
		
		String S6 = new String("America");
		//only 1 object will be created
		
		String S7 = "America"; 
		//0 objects will be created
		
		String S8 = "India";
		
		System.out.println("***********************************************************************");
		
		String S9 = "Labrador"; //just 1 object
		String S10 = new String("Labrador"); // 2 objects
		
		//Que : Which way will you choose to create Objects when you are designing your framework
		//      and why ??
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
