package seleniumex;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieTest {
    WebDriver driver;

    @Test
    public void login_state_should_be_restored() {
      
    	WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.navigate().to("https://www.google.com");
        
        WebElement error = driver.findElement(By.className("error-code"));
        
        if(error.getText().equals("DNS_PROBE_FINISHED_NO_INTERNET") || error.getText().equals("ERR_NAME_NOT_RESOLVED")) {
            System.out.println("No Internet Connection");
        } else {
            System.out.println("Internet Connected");
        }
        
        driver.close();
    }
}