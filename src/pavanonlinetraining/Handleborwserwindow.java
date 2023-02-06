package pavanonlinetraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleborwserwindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jajit\\OneDrive - VMware, Inc\\VMwareCorp\\Documents\\Baseline\\Notes_Daily\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//getWindowHandle()
		//getWindowHandle
		
	//	String windowID = driver.getWindowHandle();
	//	System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windomany = driver.getWindowHandles();
		
		System.out.println(windomany);
		
		Iterator<String> itr = windomany.iterator();
		
		String parentId = itr.next();
		String childId = itr.next();
		
		System.out.println("Parent windowId = " + parentId);
		System.out.println("Child windowId = " + childId);
		
		
		List<String> windowIDList = new ArrayList(windomany);   //converting Set to List
		
		
		
		String parentWindowId = windowIDList.get(0);
		String childWindowId = windowIDList.get(1);
		
		System.out.println("Parent windowId = " + parentWindowId);
		System.out.println("Child windowId = " + childWindowId);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title = " + driver.getTitle());
	
		driver.switchTo().window(childWindowId);
		System.out.println("childWindowId window title = " + driver.getTitle());
		
		
		//for each loop
		
		for(String windid : windowIDList)
		{
			System.out.println(windid);
			String title = driver.switchTo().window(windid).getTitle();
			System.out.println(title);
		}
			
	//	driver.close();
		
		//closing specific browser
//		for(String windid : windowIDList)
//		{
//			String title = driver.switchTo().window(windid).getTitle();
//			if(title.equalsIgnoreCase("OrangeHRM"))
//			{
//				System.out.println("close the window");
//				driver.close();
//			}
//		}
		
	}

}
