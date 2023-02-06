package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
            //Initializing the firefox driver (Gecko)
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jajit\\OneDrive - VMware, Inc\\VMwareCorp\\Documents\\Baseline\\Notes_Daily\\geckodriver.exe");       	
        driver = new FirefoxDriver();	  
	    driver.get("https://www.demoqa.com"); 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	   driver.quit();
         }
 
        @Test
        public void ChromeTest()
        	{ 
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jajit\\OneDrive - VMware, Inc\\VMwareCorp\\Documents\\Baseline\\Notes_Daily\\chromedriver.exe");
	  //Initialize the chrome driver
        	driver = new ChromeDriver();
        	driver.get("https://www.demoqa.com"); 
        	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        	driver.quit();
 	}
}