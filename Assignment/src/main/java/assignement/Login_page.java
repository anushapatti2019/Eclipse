package assignement;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login_page  {

	WebDriver driver;

	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "tbluser_email")
	WebElement username;

	@FindBy(id = "tbluser_password")
	WebElement password;

	@FindBy(name = "commit")
	WebElement submit;
	
	@FindBy(css=".help-block")
	List<WebElement> errormsg;

	public void login(String name, String pw) {
		username.sendKeys(name);
		password.sendKeys(pw);
		submit.click();
		
	}

	public void gotoURL() {
		
		driver.manage().window().maximize();
		driver.get("https://abrazohomes.stg.lotvue.com");
	}
	
	public void getErrorText() {
		
		for(WebElement e:errormsg) {
			e.getText();
		}
		
	}
	

}
