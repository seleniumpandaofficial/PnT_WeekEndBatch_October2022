package java_session_6thNovember_2022;

public class Animal1 {

	// Objects consist of:
	/*
	 * 1. Identity: name 2. State/attribute: color, breed, age 3. Behavior: eat,
	 * run, sleep, etc.
	 */
	
	//Object is nothing but collection of all the non-static entities

	String color = "Fawn";
	String breed = "Labrador";
	int age = 10;

	public static void main(String[] args) {

		Animal1 Romeo = new Animal1();
		Animal1 Romeo1 = new Animal1();

		// Animal1 is the Class
		// Romeo is the object reference
		// new is the keyword
		// Animal1() is the Constructor
		// new Animal1() is the Object

		Romeo.eating();
		Romeo.sleeping();
		
		Birds moti = new Birds();
		moti.chirping();
		moti.flying();

	}

	public void eating() {
		System.out.println("Romeo eats");
	}

	public void sleeping() {
		System.out.println("Romeo sleeps");
	}

}

class Birds {

	String name = "Moti";
	String breed = "Parrot";
	int age = 3;

	public void chirping() {
		System.out.println("Moti chirps");
	}

	public void flying() {
		System.out.println("Moti flies");
	}

}