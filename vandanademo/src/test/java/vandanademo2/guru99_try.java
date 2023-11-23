package vandanademo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99_try {
public static String link = "https://demo.guru99.com/test/newtours/index.php";
WebDriver driver;


@BeforeTest
public void tc()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(link);
	driver.manage().window().maximize();
}
@Test
public void tc2() {
	String beforelogin=driver.getTitle();
	driver.findElement(By.name("userName")).sendKeys("user");
	driver.findElement(By.name("password")).sendKeys("user");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
//	driver.findElement(By.xpath("//*[@width='77']/a")).click();
//	WebElement van = driver.findElement(By.name("country"));
//	Select s=new Select(van);
//	s.selectByIndex(1);
//	System.out.println(driver.getTitle());
//	driver.navigate().back();
//	List<WebElement> ele=driver.findElements(By.tagName("a"));
//	System.out.println(ele.size());
//	for(int i=0;i<ele.size();i++){
//		String str= ele.get(i).getAttribute("href");
//		String str1="https://demo.guru99.com/test/newtours/support.php";
//		
//		if(str.equals(str1))
//		{
//			System.out.println("the link under construction "+ele.get(i).getText());
//		}
//		else
//		{
//			System.out.println("the link is working "+ele.get(i).getText());
//		}
//}
//}

@Test
public void tc3() throws InterruptedException {
	driver.findElement(By.xpath("//*[@width='77']/a")).click();
	Actions act =new Actions(driver);
	WebElement van = driver.findElement(By.name("country"));
	Thread.sleep(3000);
	act.click(van).build().perform();
	act.sendKeys(van, Keys.ARROW_DOWN).click().build().perform();
	act.sendKeys(van, Keys.ARROW_DOWN).click().build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




}