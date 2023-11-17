package ExtendReports.Exreports;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.WebDriver;

public class Exreports {
	ExtentReports er;
	
	@BeforeTest
	public void reports() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Web Testing");
		report.config().setDocumentTitle("Test Results");
		
		er= new ExtentReports();
		er.attachReporter(report);
		er.setSystemInfo("Tester", "Anusha ");
		
	}
	
	@Test
	public void simple_demo() {
		
		er.createTest("simple_demo");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.close();
		er.flush();
		
	}

}
