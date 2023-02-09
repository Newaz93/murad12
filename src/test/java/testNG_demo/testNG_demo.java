package testNG_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG_demo {

	static WebDriver driver;
	
	
	
	@Test
	
	public void murad () throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	
	//According to test case we open 1st URL, then after open page we select ant option and that sub page must open
	
	driver = new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.1");
	
	boolean result = driver.findElement(By.linkText("Categories")).isDisplayed();
	Thread.sleep(5000);
	
	Assert.assertTrue(result);
	driver.quit();
	
	
	//Hard Assert=if varification is called the next step code doesn't work
	}
}
