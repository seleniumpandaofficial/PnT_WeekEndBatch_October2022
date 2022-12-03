package java_session_26thNovember_2022;

public class Encapsulation_Concept {
	
//Encapsulation: it's a mechanism to store variables and methods of a Class together. 
//Objective: it is done in a secure environment where the members are accessible by the members of the same Class

	
	//Declare the instance variables as Private
	
	//setter and getter methods in Java - Encapsulation

	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setName(String newName) {
		name = newName;
	}

}
