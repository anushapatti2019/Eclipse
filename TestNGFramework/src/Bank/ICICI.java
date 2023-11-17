package Bank;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ICICI {
	@Test
	public void login() {
		System.out.println("ICIC Login page");
	}
	@Test
	public void account() {
		System.out.println("ICICI saving account");
	}
	@Test(groups= {"smoke"})
	public void transfer() {
		System.out.println("ICICI tranfer fund");
	}
	@AfterTest
	public void logout() {
		System.out.println("ICICI logout");
	}
}
