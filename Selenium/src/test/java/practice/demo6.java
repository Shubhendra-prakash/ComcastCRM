package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentWindowID = driver.getWindowHandle();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allIDs = driver.getWindowHandles();
		for(String id:allIDs) {
			driver.switchTo().window(id);
			String currentWindowURL = driver.getCurrentUrl();
			if(currentWindowURL.equals("https://demoapps.qspiders.com/ui/browser/Login")) {
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.id("password")).sendKeys("manager");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				break;	
			}
		}
		
          driver.switchTo().window(parentWindowID);
          System.out.println(driver.getCurrentUrl());
	}
}