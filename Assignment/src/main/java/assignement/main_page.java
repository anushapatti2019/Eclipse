package assignement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_page {

	public static void main(String[] args) throws InterruptedException {
		String ProductType = "Operations";
		String AccordionType="Lots to show in Inventory Lots";
		String Community="Mill Colores";
		String sold="Status";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://abrazohomes.stg.lotvue.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("tbluser_email")).sendKeys("gousebashas@lotvue.com");
		driver.findElement(By.id("tbluser_password")).sendKeys("1");
		driver.findElement(By.name("commit")).click();

		
		driver.findElement(By.cssSelector("a[class='text-menu']")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Marketing')]")).click();
		
		List<WebElement> values = driver.findElements(By.cssSelector("a[class='main_navigator']"));
		
		 
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
			if (values.get(i).getText().equalsIgnoreCase(ProductType))
				values.get(i).click();

		}
		
		driver.findElement(By.cssSelector("a[class='menu-icons hide-icon']")).click();
		List<WebElement> list = driver.findElements(By.id("website_filter_configurations"));
		
		for(WebElement li:list) {
			if(li.getText().equalsIgnoreCase("Website Filter Configuration"))
				li.click();
		}
		List<WebElement> accordon = driver.findElements(By.cssSelector(".acc-heading"));
		for(WebElement dd:accordon) {
			if(dd.getText().equalsIgnoreCase(AccordionType)) {
				dd.click();
			}
		}
		
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class='panel-body']/div"));
		
		for(WebElement dd:dropdown) {
			if(dd.getText().equalsIgnoreCase(Community)) {
				WebElement element = dd;
				WebElement ele = element.findElement(By.cssSelector("[class='multiselect-native-select']"));
				ele.click();
				List<WebElement> options = ele.findElements(By.cssSelector("[class='multiselect-container dropdown-menu'] li a label input"));
				for(WebElement opt:options) {
					if(opt.getText().equalsIgnoreCase(sold)) {
						opt.click();
						driver.findElement(By.id("filter_config")).click();
					}
				}
				
			}
		}
		Thread.sleep(2000);
		driver.close();
	}

}
