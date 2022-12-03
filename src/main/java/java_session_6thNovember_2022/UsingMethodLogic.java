package java_session_6thNovember_2022;

public class UsingMethodLogic {

	// static is concept of the Class
	// non-static is concept of the Object
	// a static entity can be called directly or by the help of the Class

	public static void main(String[] args) {
		System.out.println("This is the main method");
		UsingMethodLogic.logic1();
		UsingMethodLogic.logic2();
		UsingMethodLogic.logic3();
		logic1();
		logic2();
		logic3();

		UsingMethodLogic objref = new UsingMethodLogic();
		objref.logic4();

	}

	public static void logic1() {
		System.out.println("I have coding logic1");
	}

	public static void logic2() {
		System.out.println("I have coding logic2");
	}

	public static void logic3() {
		System.out.println("I have coding logic3");
	}

	public void logic4() {
		System.out.println("I have coding logic4");
	}

}
