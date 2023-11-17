package Bank;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SBI {
	@Test(dataProvider="getdata")
	public void login(String UN,String PW) {
		System.out.println("SBI Login page");
		System.out.println(UN);
		System.out.println(PW);
	}
	
	@Test
	public void account() {
		System.out.println("SBI saving account");
	}
	
	@Test(groups= {"smoke"})
	public void transfer() {
		System.out.println("SBI tranfer fund");
	}
	
	@Test
	public void logout() {
		System.out.println("SBI logout");
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		data[0][0]="fisrtusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
}
