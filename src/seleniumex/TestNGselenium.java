package seleniumex;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGselenium {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();				
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.google.com");
		Thread.sleep(5);

	}

	@Test
	public void googleTitleTest() throws InterruptedException
	{
		
		Thread.sleep(5);
		String title = driver.getTitle();
		System.out.println(title);
	
	}
	
	@Test(dependsOnMethods="googleTitleTest")
	public void googlelogotest()
	{
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Reporter.log("Welcome to testNG logs");
		System.out.println(b);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("close the browser");
	
	}

}
