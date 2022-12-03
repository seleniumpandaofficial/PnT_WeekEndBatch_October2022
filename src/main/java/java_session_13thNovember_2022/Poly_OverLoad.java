package java_session_13thNovember_2022;

public class Poly_OverLoad {
	
	public static void main(String[] args) {
		
		Poly_OverLoad obj = new Poly_OverLoad();
		obj.display();
		obj.display(10);
		obj.display(11, 12);
		obj.display("java");
		obj.display("hello", "world");
		obj.display(new StringBuffer("anything"));
		obj.display(new StringBuilder("anything"));	
		obj.display("name", new StringBuffer("anything"), new StringBuilder("anything"));
	}
	public void display() {
		System.out.println("This is a non-parameterized method");
	}
	
	public void display(int i) {
		System.out.println("This is a single int type parameterized method");
	}
	
	public void display(int j, int k) {
		System.out.println("This is a multiple int type parameterized method");
	}
	
	public void display(String S) {
		System.out.println("This is a single String type parameterized method");
	}
	
	public void display(String S1, String S2) {
		System.out.println("This is a multiple String type parameterized method");
	}
	
	public void display(StringBuffer S3) {
		System.out.println("This is a single StringBuffer type parameterized method");	
	}
	
	public void display(StringBuilder S4) {
		System.out.println("This is a single StringBuilder type parameterized method");	
	}
	
	public void display(String S5, StringBuffer S6, StringBuilder S7) {
		System.out.println("This is a multiple String, StringBuffer and StringBuilder type parameterized method");
	}

}
