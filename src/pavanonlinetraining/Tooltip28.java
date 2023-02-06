package pavanonlinetraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip28 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		/*tooltip
		 driver.get("https://jqueryui.com/tooltip/");
		 
		 driver.switchTo().frame(0);
		 
		 WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
		 String value = inputbox.getAttribute("title");
		 
		 System.out.println(value);
		 */
		
		//how to open a link in new tab
		/*
		driver.get("https://demo.opencart.com/");
		
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Tablets']")).sendKeys(tab);
		*/
		
		//Open URLs in 2 tabs	
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		//open in new TAB
		driver.switchTo().newWindow(WindowType.TAB); 
	//	driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open in new window
		driver.get("https://www.opencart.com/");
		driver.close();
		driver.quit();
		
	}

}
