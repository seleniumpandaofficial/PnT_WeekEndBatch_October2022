package java_session_20thNovember_2022;

//Abstraction
//Abstraction means hiding internal implementation and just highlighting the setup services

//Abstraction in Java can be achieved by 2 ways:-
//1. Abstract Class [0 to 100% abstraction]
//2. Interface [100% abstraction]

//unimplemented methods - they do not have a body. they are also called abstract methods
//if a Class uses the keyword abstract, it becomes an abstract Class
//An abstract class can have both abstract(unimplemented) methods and normal methods
//An abstract method can only reside inside an Abstract class
//cannot have a private abstract method 
//can have a non-static protected abstract method
//cannot have a static protected, public abstract method
//can have an abstract method without an access modifier

public abstract class Abstraction_Concept {
	
	String student_name;
	int student_age;
	private String student_bankaccount; 

	public static void displayLogic0() {
		System.out.println("This is a normal static method");
	}

	public void displayLogic1() {
		System.out.println("This is a normal method");
	}

	public abstract void displayLogic2();

	public abstract void displayLogic3();

	// private abstract void displayLogic4();

	protected abstract void displayLogic5();

	abstract void displayLogic6();

}
