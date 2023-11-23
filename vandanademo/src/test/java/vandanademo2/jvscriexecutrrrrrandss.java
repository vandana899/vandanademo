package vandanademo2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jvscriexecutrrrrrandss {
	public static String url="https://the-internet.herokuapp.com/login";
	WebDriver driver;

	@BeforeTest
	public void tc1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
}
	@Test
	public void jj() throws IOException {
//driver itself is doing all the actions in javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('oxd-input oxd-input--active')[0].value='Admin'");
//		js.executeScript("document.getElementsByClassName('oxd-input oxd-input--active')[1].value='admin123'");
		js.executeScript("document.getElementById('username').value='tomsmith'");
		  js.executeScript("document.getElementById('password').value='SuperSecretPassword!'");
		 js.executeScript("document.getElementsByClassName('radius')[0].click()");
		  //scrolling to the particular element
//		  js.executeScript("window.getElementsByClassName('button secondary radius')[0].scrollIntoView()");
//		  System.out.println("gudyug");
//		  js.executeScript("document.getElementsByClassName('button secondary radius')[0].click()");
		  //scroll up step by step
		  js.executeScript("window.scrollBy(0,-100) ");
		  //scroll down
		  js.executeScript("window.scrollBy(0,100) ");
		  //for extreme down
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  
		  
		  TakesScreenshot ss=(TakesScreenshot)driver;
		  File jpnng=ss.getScreenshotAs(OutputType.FILE);
		  //png is the extension 
		  FileUtils.copyFile(jpnng, new File("C:\\Users\\hp\\Pictures\\selenium ss\\vandana.png"));
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}