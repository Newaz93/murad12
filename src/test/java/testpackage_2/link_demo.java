package testpackage_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().deleteAllCookies();	
		List<WebElement>alllink =driver.findElements(By.tagName("a"));
	
	   System.out.println(alllink.size());
	 
	   
	   for(int i=0;i<alllink.size();i++) {
		   
	  System.out.println(alllink.get(i).getAttribute("href"));
	   
	  
	   
	   }
	driver.quit(); 
	}

}
