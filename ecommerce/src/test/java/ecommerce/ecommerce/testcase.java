package ecommerce.ecommerce;

import org.openqa.selenium.WebDriver;

import Utilities.Reusable;

public class testcase {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		Login l= new Login(driver);
		l.login(driver);
		
		
		

	}

}
