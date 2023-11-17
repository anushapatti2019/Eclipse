package Bank;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Kotak {
	@Test
	public void login() {
		System.out.println("Kotak Login page");
	}
	@Test
	public void account() {
		System.out.println("Kotak saving account");
	}
	@BeforeClass
	public void welcomekotak() {
		System.out.println("welcomekotak");
	}
	@Test(groups= {"smoke"})
	public void transfer() {
		System.out.println("Kotak tranfer fund");
	}
	@Test
	public void logout() {
		System.out.println("Kotak logout");
	}
	@BeforeSuite
	public void prerequisites() {
		System.out.println("prerequisites");
	}
}
