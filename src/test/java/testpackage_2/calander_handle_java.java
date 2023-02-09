package testpackage_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander_handle_java {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.southwest.com/");
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");//if we need scroll down the page then we use that code
		
		JavascriptExecutor date =(JavascriptExecutor)driver;
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='11/18/2022'");
		Thread.sleep(5000);
		
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='11/25/2022'");
		Thread.sleep(5000);
		driver.close();
	}

}
