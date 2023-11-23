package vandanademo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class my_try {
	//public static String vandana= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	//public static void main(String[]args) throws InterruptedException
//		{
//			System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//chromedriver.exe");
		//@Test
//		public void test() throws InterruptedException {
//
//				WebDriverManager.chromedriver().setup();
//			WebDriver driver=new ChromeDriver();
//			driver.get(vandana);
//			Thread.sleep(3000);
//			driver.findElement(By.name("username")).sendKeys("Admin");
//			driver.findElement(By.linkText("username")).sendKeys("Admin");
//			driver.findElement(By.name("password")).sendKeys("admin123");
//			driver.findElement(By.xpath("//*[@type='submit']")).click();
//			driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
//			
//			driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("van");
//			driver.findElement(By.xpath("//*[@type='submit']")).click();
//			driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[6]")).click();
//			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
//			
//			driver.close();
//			//driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']")).sendKeys("bbb");
//	}
//		
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	
	public static String van= "https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	@BeforeTest 
	public void BT() {
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		 
		 extent.attachReporter(htmlReporter);
		 
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.navigate().to(van);
		//driver.get(van);
	}
	@Test(invocationCount = 1,invocationTimeOut =  11000)
	
	public void test1() throws InterruptedException
	{
		//SoftAssert softassert=new SoftAssert();
		SoftAssert softassert=new SoftAssert();
		
		test=extent.createTest("this is my second test");
		String  title = driver.getTitle();
		softassert.assertEquals(title,"Welcome: Mercury Tours" );
		
		
		//Assert.assertEquals(title , "Mercury Tours");
		
		
		
		
		WebElement biba=driver.findElement(By.name("userName"));
		
		biba.sendKeys("user");
		
		biba.clear();
		biba.sendKeys("user");
		test.pass("you have entered username");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	//	boolean status = biba.isDisplayed();
		driver.findElement(By.name("password")).sendKeys("user");
		
		
		test.pass("you have entered password");
		
		WebElement element= driver.findElement(By.xpath("//*[@type='submit']"));
		element.click();
		String  afterlogin = driver.getTitle();
		softassert.assertEquals(afterlogin,"Login: Mercury Tours" );
		
		
		
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@class='collapse navbar-collapse']/ul/li[1]/a")).click();
//		Thread.sleep(5000);
//		 driver.navigate().back();
//		 driver.navigate().refresh();
//		 driver.navigate().forward();
		 
		//Select s=new Select(driver.findElement(By.name("country")));
		//s.selectByIndex(4);
		softassert.assertAll();
	}
	
		//s.selectByIndex(4);
//		s.selectByVisibleText("AUSTRALIA");
//		driver.findElement(By.name("password")).sendKeys("dontknow111");
//		driver.findElement(By.name("confirmPassword")).sendKeys("dontknow111");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//	  //	driver.findElement(By.xpath("//*[@type='submit']")).click();
        
	
		
	@AfterTest
    public void aftertest() throws InterruptedException
		{
		Thread.sleep(2000);
		driver.close();
extent.flush();
		}
}
