package java_session_12thNovember_2022;

public class Execution {

	public static void main(String[] args) {
		
		GrandParent gp = new GrandParent();
		gp.gold();
		gp.cash();
		
		
		Parent parent = new Parent();   // Uni/Single Level Inheritance (Super Class to Sub Class)
		parent.bungalow();
		parent.farmhouse();
		parent.gold();
		parent.cash();
	
		
		
		Child child = new Child();
		child.guitar();                      //Multi-Level (GrandParen to Parent to Child) Inheritance
		child.superCar();
		child.farmhouse();
		child.bungalow();
		child.cash();
		child.gold();
		// child.box();   cannot extend a Private method of the parent class
        child.ngo();
        
	}

}
