package Bank;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HDFC {
	
	@BeforeTest
	public void login() {
		System.out.println("HDFC Login page");
	}
	@Parameters({"URL"})
	@Test
	public void account(String url) {
		System.out.println("HDCF saving account");
		System.out.println(url);
	}
	@Test(groups= {"smoke"})
	public void transfer() {
		System.out.println("HDFC tranfer fund");
		
	}
	@AfterTest
	public void logout() {
		System.out.println("HDFC logout");
	}
}
