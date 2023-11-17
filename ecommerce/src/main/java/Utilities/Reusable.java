package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import ecommerce.ecommerce.Login;

public class Reusable {
	
	WebDriver driver;
	Login l;
	
	public Reusable(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Login browser_launch() {
		
		driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		return l;
		
	}
	
	public void close_browser() {
		driver.close();
	}

}
