package Loans;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bikeloan {
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
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}

}
