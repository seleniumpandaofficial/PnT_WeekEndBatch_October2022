package java_session_26thNovember_2022;

public class Student extends Human{

	public static void main(String[] args) {
		
     Student child = new Student();
     child.display();
	}
	
	
	public void essay() {
		System.out.println("this is Child class' essay");
	}
	
	
	public void display() {
		essay();       //this is Child class' essay
		super.essay(); //this is Parent class' essay
	}

}
