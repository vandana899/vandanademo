package vandanademo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extent_orange_hrm {
	ExtentHtmlReporter  htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	
	
	
	public static String vandana= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String fb="https://www.voot.com/";
	public static String vandana2="https://www.instagram.com/";
	WebDriver driver;
	
	
	
	
	
	@BeforeTest
	public void BT() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(vandana);
		//to maximize my url
		driver.manage().window().maximize();
		
		
		
		
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		
		
		
		
}
	@Test
	public void test() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		test=extent.createTest("this is my first test");
		String afterlogin = driver.getTitle();
		//Assert.assertEquals(afterlogin, "vandana");
		softassert.assertEquals(afterlogin, "OrangeHRM");

		WebElement biba=driver.findElement(By.name("username"));
		if (biba. isEnabled())
		{
			biba.sendKeys("Admin");
			test.pass("you have entered the username");
		}
		WebElement bubub=driver.findElement(By.name("password"));
		if (biba.isDisplayed())
		{
			bubub.sendKeys("admin123");
			test.pass("you have entered the password");
		}
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		test.info("user is able to see the afterlogin page");
		//driver.manage().timeouts().implicitWait(10, ""));
		softassert.assertAll();
	}
	
	 @AfterTest
	 public void test1() throws InterruptedException {
		 driver.close();
		 extent.flush();
	 }	 
}