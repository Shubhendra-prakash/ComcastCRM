package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SampleTestwithPom {
	@FindBy(name="user_name")
	WebElement ele1;
	
	@FindBy(name="user_password")
			WebElement ele2;
	
	@FindAll({@FindBy(id="sub"), @FindBy(xpath="//input[@type='submit']")})
	WebElement ele3;
	
	
	
	@Test
	public void sampleTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		 SampleTestwithPom s = PageFactory.initElements(driver, SampleTestwithPom.class);
		 s.ele1.sendKeys("admin");
		 s.ele2.sendKeys("manager");
		 s.ele3.click();
	}

}
