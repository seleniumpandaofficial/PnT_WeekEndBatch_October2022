package java_session_13thNovember_2022;

public class AutomaticPromotion {

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.show(10);
		ap.show("java");
		ap.show('a');

	}

	public void show(int i) {
		System.out.println("This is an int parameter method");

	}

	public void show(String S) {
		System.out.println("This is an String parameter method");
	}

}
