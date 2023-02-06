package pavanonlinetraining;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.deadlinkcity.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int borkenlinks=0;
		
		for(WebElement element : links)
		{
			String url  = element.getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
			URL link = new URL(url);
			try {	
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			httpconn.connect();
			if(httpconn.getResponseCode()>=400)
			{
				System.out.println(httpconn.getResponseCode() +url+ " is broken link" );
				borkenlinks++;
			}
			else
			{
				System.out.println(httpconn.getResponseCode() +url+ " is valid link" );
			}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
					
		}
		
		System.out.println("Number of broken links =" + borkenlinks);
		driver.close();

	}

}
