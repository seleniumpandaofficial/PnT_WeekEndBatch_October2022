package java_session_20thNovember_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// a normal Class can extend another Class as well as implement multiple interfaces
public class Evaluate extends Abstraction_Concept implements Introduction, IntroductionPart2{

	public static void main(String[] args) {
		Evaluate ev = new Evaluate();
		ev.display();
		ev.display1();
		ev.someThing();
		
		Introduction intro = new Evaluate();
		
		WebDriver driver = new ChromeDriver();
		
	}

	@Override
	public void display() {
		System.out.println("This is display");
		
	}

	@Override
	public void display1() {
		System.out.println("This is display1");
		
	}

	@Override
	public void launchUrl() {

		
	}

	@Override
	public void tearDown() {
	
		
	}

	@Override
	public void displayLogic2() {
		
		
	}

	@Override
	public void displayLogic3() {
		
		
	}

	@Override
	protected void displayLogic5() {
		
		
	}

	@Override
	void displayLogic6() {
	
		
	}

}
