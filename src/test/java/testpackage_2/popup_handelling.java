package testpackage_2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_handelling {

	public static WebDriver driver; //driver now global variable, but if we declare variable under the method then its local variable
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		driver =new ChromeDriver();
	
		driver.get("https://demoblaze.com/");
		
		driver.manage().window().maximize();
		
		WebElement contact = driver.findElement(By.linkText("Contact"));
		contact.click();
		Thread.sleep(5000);
		
		WebElement sendmessage=driver.findElement(By.xpath("//button[text()='Send message']"));
		sendmessage.click();
		
		driver.switchTo().alert().accept();//this is for pop up handle//syntax for pop up
		
		Thread.sleep(5000);
		 
		driver.quit();
		
	}

}
