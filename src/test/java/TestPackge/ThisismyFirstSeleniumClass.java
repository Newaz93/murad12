package TestPackge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThisismyFirstSeleniumClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		//Test case done by using Selenium
		//***Given open Application
		//then click the login
		//then enter valid user name
		//then enter valid password
		//then click login
		//then verify user , and user can login successfully
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//run the SE
		
		driver.get("https://demoblaze.com/");// Given Open Application;(1st step of test case) & we also maximize our window
		
		driver.manage().window().maximize();//we give time to load our page because in industry Internet i slow
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// load time for the page, 20 sec is standard time
		
		driver.manage().deleteAllCookies(); // this for all cookies delete in website, when we entry any page cookies shows for accept or delete
		//upto that part its selenium
		//for SE 20 sec load time & after that java code running which will run each code after 5 sec interval
		
		
		WebElement LoginButton =driver.findElement(By.id("login2")); //we found that by ID as per test case(2nd step);
		
		LoginButton.click(); //Click is action (2nd step of test case, click login button)
		
		Thread.sleep(5000);
		
		WebElement Username =driver.findElement(By.id("loginusername"));
		
		Username.sendKeys("muradhaque701@gmail.com");//(step 3 of test case, enter valid user name)
		
		Thread.sleep(5000);
		
		WebElement Password = driver.findElement(By.id("loginpassword"));
		
		Password.sendKeys("muradhaque");//(4th step done, enter valid password)
		
		Thread.sleep(5000);
		 
		driver.quit();
	}

}
