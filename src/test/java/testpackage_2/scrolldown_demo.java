package testpackage_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown_demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://demoblaze.com/");
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(5000);
		
		driver.quit();
	}

}
