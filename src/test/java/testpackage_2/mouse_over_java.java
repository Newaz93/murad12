package testpackage_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_java {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.dell.com/en-us");
		
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Products']"))).build().perform();
		
		Thread.sleep(5000);
		
		WebElement Server= driver.findElement(By.linkText("Servers"));
		
		Server.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
