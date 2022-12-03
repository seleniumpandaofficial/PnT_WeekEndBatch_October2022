package java_session_20thNovember_2022;

//interface is 100% abstraction
//all the unimplemented or abstract methods inside an interface are public and abstract
//variables inside an interface are public, static and final
//From Java 8, public static methods are allowed
//protected static methods are not allowed
//From Java 9, private methods are allowed
//default non-static methods are allowed in interface
//multiple inheritance is allowed in interface

public interface Introduction {

	void display(); // public abstract void display();

	public abstract void display1();

	default void someThing() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}
	
	public static void turnUp() {
		
	}
	
	
        
	public static final int j = 20;

	// final means something you cannot change. Once it is final it cannot be
	// changed
}
