package vandanademo2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handle {
	@Test
	public void gg() throws InterruptedException
	
	
	
	
	
	{
	
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        String url2="https://rahulshettyacademy.com/documents-request";
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	        driver.findElement(By.cssSelector("a.blinkingText")).click();
	        //to get all handles
	        Set<String> windows=driver.getWindowHandles();
	        System.out.println(windows);
	        
	        Iterator<String> it=windows.iterator();
	        String parentid=it.next();
	        System.out.println(parentid);
	        
	        String childid=it.next();
	        System.out.println(childid);
	        
	        Thread.sleep(5000);
	        driver.switchTo().window(childid);
	        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	        driver.switchTo().window(parentid);
	        driver.findElement(By.id("username")).sendKeys(emailId);
	        
	    }
	}
