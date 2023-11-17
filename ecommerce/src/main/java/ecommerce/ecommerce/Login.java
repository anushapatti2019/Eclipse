package ecommerce.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Reusable;

public class Login extends Reusable{

	WebDriver driver;
	
	public Login(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login2")
	WebElement login;
	
	public void login_click() {
		login.click();
	}
	
	public void login(WebDriver driver) {
		
		Reusable r= new Reusable(driver);
		Login l=r.browser_launch();
		l.login_click();
		String child = driver.getWindowHandle();
		driver.switchTo().window(child);
		driver.findElement(By.id("loginusername")).sendKeys("rajp");
		driver.findElement(By.id("loginpassword")).sendKeys("rajp");
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		//return driver;
	}
}
