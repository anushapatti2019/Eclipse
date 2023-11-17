package assignement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcome_page {
	WebDriver driver;

	public welcome_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[class='text-menu']")
	WebElement dropdown;

	@FindBy(xpath = "//a[contains(text(),'Marketing')]")
	WebElement selection;

	@FindBy(name = "commit")
	WebElement submit;
}
