package java_session_13thNovember_2022;

public class Method_Overriding {
	
	//Criterias to attain Run(Dynamic) Polymorphism
	//1. Achieved by Method overriding
	//2. Method name should be same, Class should be different, Same arguments/parameters
	//3. Have to have inheritance
	
	
	//interview questions: -
	
	//Que1: Overriding method's return type should be same ?
	//Ans1 : No
	
	//Que2: Access modifier should be same or different?
	//Ans2: Child should have a higher accessibility or should be equal to parent
	
	//Que3: Can a private method be over-ridden?
	//Ans3: No as the scope is limited within the Class
	
	
	//Que4: Can a static method be over-ridden?
	//Ans4: No - cannot override a static method
	
	
	
	public void cash() {
		System.out.println("This is cash method of parent");
	}
	
	public void office() {
		System.out.println("This is office method of parent");
	}
	
	private void tender() {
		System.out.println("This is private method of parent");
	}
	
	public static void chequeBook() {
		System.out.println("This is parent's static chequebook");
	}

}


