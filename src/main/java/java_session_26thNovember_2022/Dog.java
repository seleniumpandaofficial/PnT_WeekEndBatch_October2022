package java_session_26thNovember_2022;

public class Dog extends Animal{

	public static void main(String[] args) {
		
    Dog d = new Dog();
	}
	
	
	Dog(){
	//The parameterized super() must always be the first statement in the body of the constructor of the subclass, otherwise, we get a compilation error.
	//The compiler does not call the default constructor of the superclass in this case.	
		super("Romeo");
		
		System.out.println("This is Child class constructor");
	}

}
