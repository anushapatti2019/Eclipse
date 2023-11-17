package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assignement.Login_page;

public class endtoend {
	
	public void end_save() {
		WebDriver driver = new ChromeDriver();
		Login_page lp= new Login_page(driver);
		
		
	}

}
