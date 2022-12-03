package java_session_13thNovember_2022;

public class Child extends Method_Overriding{
	
	public static void main(String[] args) {
		Child child = new Child();
		child.cash();
		child.office();
		
		child.tender();
		
		Method_Overriding mo = new Method_Overriding();
		mo.cash();
		mo.office();
		
		Method_Overriding mp = new Child();
		mp.office();
		mp.cash();
		
		
		/*
		 * Child childp = (Child) new Method_Overriding(); childp.cash();
		 * childp.office();
		 */
	}
	
	public void cash() {
		System.out.println("This is chid's cash method");
	}
	
	public void office() {
		System.out.println("This is chid's office method");
	}
	
	public void tender() {
		System.out.println("This is child's tender method");
	}
	
	
	
}
