package testpackage_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().deleteAllCookies();	
		
		
		driver.switchTo().frame("classFrame");///SE give this method to click the individual frame
		
		WebElement Helplink =driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]/a"));
		
		
		Helplink.click();
		
	    Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
