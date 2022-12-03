package java_session_STRINGS_26thNovember_2022;

public class StringOperations_Part2 {

	public static void main(String[] args) {
		//Strings can be updated using methods
		
		//replace()
		String S1 = "I am learning Seleninum";
		System.out.println(S1.replace("am", "am not"));
		
		String S2 = "Can an animal run";
		System.out.println(S2.replace("an", "some"));
		
		//replaceFirst()
		System.out.println(S2.replaceFirst("an", "some"));
		
		//replaceAll()
		System.out.println(S2.replaceAll("an", "some"));
		//replaceAll() can work with regular expressions whereas replace() cannot
		
		System.out.println(S2.replaceAll("an(.)", "add"));
		System.out.println(S2.replaceAll("an(.*)", "add"));
		
		
		//Strings can be searched using certain method
		//indexOf()
		String S3 = "Seleniumefefefe";
		System.out.println(S3.indexOf(6)); //important interview question
		System.out.println(S3.indexOf('m'));
		System.out.println(S3.indexOf("ium"));
		
		//lastIndexOf()
		System.out.println(S3.lastIndexOf('e'));
		System.out.println(S3.lastIndexOf("fef"));
		//charAt()
		System.out.println(S3.charAt(14));
		//contains()
		System.out.println(S3.contains("f"));
		//endsWith()
		System.out.println(S3.startsWith("Sele"));
		//startsWith()
		System.out.println(S3.endsWith("fefe"));
		
		//Case conversion methods
		
		String S4 = "DancingmonkEY"; 
		//toUpperCase()
		System.out.println(S4.toUpperCase());
		//toLowerCase()
		System.out.println(S4.toLowerCase());
		
		
		//Type Conversion methods
		//valueOf()
		//toCharArray()
		
		int i = 1;
		int j = 2;
		System.out.println(i + j);
		
		String S5 = String.valueOf(i); //converts primitive data type into to String
		String S6 = String.valueOf(j);
		System.out.println(S5);
		System.out.println(S6);
		System.out.println(S5 + S6);
		
		char[] ch =  S4.toCharArray(); //converting String to char array
		System.out.println(ch);
		
	}

}
