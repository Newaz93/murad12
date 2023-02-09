package testNG_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verify_cart {

	@Test
	
	public void test1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();	
		
		WebElement samsungphone= driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		
		samsungphone.click();
		WebElement AddToCart =driver.findElement(By.linkText("Add to cart"));
		AddToCart.click();
		
	    Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		WebElement cart = driver.findElement(By.id("cartur"));
		cart.click();
		Thread.sleep(5000);
		
		Boolean result= driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']")).isDisplayed();
		Assert.assertTrue(result);  //assert use for verification
		
		driver.quit();
	}
	
}
