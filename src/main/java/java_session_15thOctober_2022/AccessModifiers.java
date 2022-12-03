package java_session_15thOctober_2022;

public class AccessModifiers {

	public static void main(String[] args) {
		//4 types 
		// public - highest accessibility (
		// protected -
		// private
		// default (cannot be used in a Class). It can only be used in an interface
		// https://www.geeksforgeeks.org/access-modifiers-java/

	}
	
	public static void test() {
		System.out.println("This is a simple test method");
	}
	
	protected static void test1() {
		System.out.println("This is a simple test1 method");
	}
	
	private static void test2() {
		System.out.println("This is a simple test2 method");
	}
	
	/*
	 * default static void test3() {
	 * System.out.println("This is a simple test3 method"); }
	 */

}
