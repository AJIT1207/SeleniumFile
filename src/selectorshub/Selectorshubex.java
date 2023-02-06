package selectorshub;

import java.time.Duration;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectorshubex {
	static Logger log = Logger.getLogger(Selectorshubex.class);

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://selectorshub.com/xpath-practice-page/");
		
//		//This Element is inside single shadow DOM.
//		//String cssSelectorForHost1 = "#userName";
//		Thread.sleep(1000);
//		SearchContext shadow = driver.findElement(By.cssSelector("#userName"));
//		WebElement last1 = (WebElement)((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadow);	
//		Thread.sleep(1000);
//		last1.findElement(By.cssSelector("#kils")).click();
//		Actions act = new Actions(driver);
//	act.sendKeys(Keys.TAB).perform();
		
		//This Element is inside single shadow DOM.
//		String cssSelectorForHost1 = "#userName";
//		Thread.sleep(1000);
//		WebElement shadowDomHostElement = driver.findElement(By.cssSelector("#userName"));
//		WebElement last = (WebElement)((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);
//		Thread.sleep(1000);
//		last.findElement(By.cssSelector("#concepts")).click();
//			
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.TAB).perform();
//		
		//This Element is inside 2 nested shadow DOM.
		String cssSelectorForHost1 = "#userName";
		String cssSelectorForHost2 = "#app2";
		Thread.sleep(1000);
		WebElement shadow0 = driver.findElement(By.cssSelector("#userName"));
		Thread.sleep(1000);
		SearchContext shadow1 = driver.findElement(By.cssSelector("#app2"));
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#pizza")).sendKeys("hello");
		
		
	}

}
