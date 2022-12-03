package java_session_13thNovember_2022;

public class MainMethod_Overloading {

	public static void main(String[] args) {
		MainMethod_Overloading.main(10);
		main(10);
		main(args = new String[3], args = new String[4]);
	}
	
	public static void main(int i) {
		System.out.println("This is an int type parameter main method");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is multiple parameters main method");
	}

}
