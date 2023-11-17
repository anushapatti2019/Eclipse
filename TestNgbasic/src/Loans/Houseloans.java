package Loans;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Houseloans {
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void calculate() {
		System.out.println("calculate");
	}
	@Test
	public void intrest() {
		System.out.println("intrest");
	}
}
