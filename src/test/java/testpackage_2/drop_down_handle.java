package testpackage_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_handle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Select s1=new Select(driver.findElement(By.id("gh-cat")));
		
		//s1.selectByValue("2984");select by value
		
		s1.selectByVisibleText("Cameras & Photo");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
