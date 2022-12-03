package java_session_26thNovember_2022;

public class Car extends Vehicle{
	
	//super keyword in java is a reference variable used to refer to parent class Objects
	//super with variables
	//super with methods
	//super with constructors
	
	int maxSpeed = 120;
	
	public static void main(String[] args) {
		
		Car child = new Car();
		child.display();
	}
	
	
	public void display() {
		System.out.println("Maximum Speed is : " +  super.maxSpeed);
	}

}
