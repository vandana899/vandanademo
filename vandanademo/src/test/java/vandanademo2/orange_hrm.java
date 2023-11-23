package vandanademo2;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orange_hrm {
	public static String vandana= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String fb="https://www.voot.com/";
	public static String vandana2="https://www.instagram.com/";
	WebDriver driver;
	
	@BeforeTest(enabled = true )
	public void BT() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(vandana);
		//to maximize my url
		driver.manage().window().maximize();
		
	}
	@Test(enabled = true)
	public void test() throws InterruptedException {
		Thread.sleep(3000);

		WebElement biba=driver.findElement(By.name("username"));
		if (biba. isEnabled())
		{
			biba.sendKeys("Admin");
		}
		WebElement bubub=driver.findElement(By.name("password"));
		if (bubub.isDisplayed())
		{
			bubub.sendKeys("admin123");
		}
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
}
	@Test( enabled = false ,priority = 1)
	public void test2() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li/a")).click();
//		Thread.sleep(2000);
		Actions act1= new Actions (driver);
		WebElement eli= driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li/a"));
        act1.click(eli).build().perform();	
        Thread.sleep(2000);
	}
        
        
        
        @Test(enabled= false,priority = 2)
        public void test3() throws InterruptedException {
        	Actions act2= new Actions(driver);
        	/////mouse actions for right click 
        	
        	////*[@class='oxd-form']//div//div//div//div//div//input[@class='oxd-input oxd-input--active']
        	
        	WebElement mussi=driver.findElement(By.xpath("//*[@class='oxd-table-filter-area']//div/div/div/div/div/label"));
        	act2.contextClick(mussi).build().perform();
        	act2.click(mussi).build().perform();
        	  
        	
//        	WebElement mussi4=driver.findElement(By.xpath("//*[@type='button']"));
//        	mussi4.click();vve
//        	
//        	Thread.sleep(2000);
//        	
        	
        	
        	
        	///to add user role using keyboard actions
         	Thread.sleep(3000);
         	  Actions act = new Actions(driver);
         	   	WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
         	  
         	   	 Thread.sleep(2000);
         	   	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
          	 Thread.sleep(2000);
          	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
          	 Thread.sleep(2000);
          	act.sendKeys(ele,Keys.ENTER).click().build().perform();
          	 Thread.sleep(2000);
          	 
          	 /////mouse over to click on search
          	WebElement baba = driver.findElement(By.xpath("//*[@class='oxd-autocomplete-wrapper']/div/input"));
          	act.click(baba).sendKeys("nana").build().perform();
       
          	 
         	WebElement mussi4 = driver.findElement(By.xpath("//*[@type='submit']"));
         	act2.moveToElement(mussi4).click().build().perform();
         	
         	
         	
         	
         	
         	
         	
         	
         	 Thread.sleep(2000);
         	   	List<WebElement>ap=driver.findElements(By.tagName("a"));
         	   System.out.println( ap.size());
         	   for (int i=0;i<=ap.size();i++) {
         		   System.out.println(ap.get(i).getText());
         		  System.out.println(ap.get(i).getAttribute("href"));
         	   }
         	   	
//        	WebElement mussi2=driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']//div//div//i"));
//        	act2.click(mussi2).build().perform();
//        	Thread.sleep(5000);
        	//WebElement mussi3=driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']//div//div//i"));
        	
//		List<WebElement> mmm=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
//		Thread.sleep(2000);
//		System.out.println(mmm.size());
//		Thread.sleep(2000);
//		
//		WebElement eli3=driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3);
//		act1.click(eli3).build().perform();
//		Thread.sleep(2000);
//		
//		 System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).getText());
//		 Thread.sleep(2000);
//		 
//		WebElement eli4=driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(4);
//		act1.click(eli4).build().perform();
//		
//		WebElement eli5=driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(5);
//		act1.click(eli5).build().perform();
//		
//		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(5).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//        Thread.sleep(2000);
//	     System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).getText());
//	     Thread.sleep(2000);
//
//	  Actions act = new Actions(driver);
//   	WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
//   	act.click(ele).build().perform();
//   	 Thread.sleep(2000);
//   	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
//   	 Thread.sleep(2000);
//   	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
//   	 Thread.sleep(2000);
//   	act.sendKeys(ele,Keys.ENTER).click().build().perform();
//   	 Thread.sleep(2000);
}
//        @Test
//        public void windowhandle() throws InterruptedException {
//        	driver.getWindowHandle();
//        	driver.getWindowHandles()
//        	//open  a new tab and switches to new tab in existing window
//        //	driver.switchTo().newWindow(WindowType.TAB);
//        	driver.switchTo().window(WindowType.TAB)
//        	driver.switchTo().window(WindowType.TAB);
//        	
//        	//for navigating to new tab
//        	driver.navigate().to(fb);
//        	driver.manage().window().maximize();
//        	Thread.sleep(2000);
//        	
//        	//navigating to second tab
//        	driver.switchTo().window(WindowType.TAB);
//        	driver.navigate().to(vandana2);
//        	
//        	
//        	
//        	//close the window
//        	driver.close();
//        	//close the tab
//        	//driver.close();\
//        	driver.quit();
//        	
//        	
//    


        @Test(enabled = true)
    	public void test8() throws InterruptedException {
        
        String beforelogin=driver.getTitle();
    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin123");
    	driver.findElement(By.xpath("//*[@type='submit']")).click();
    	String afterlogin= driver.getTitle();
    	if (beforelogin.equals(afterlogin)){
    		Thread.sleep(4000);
    		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
    		Thread.sleep(5000);
    		
    	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
    		System.out.print("title is same");
    		
    	}
    	else
    	 {
    		System.out.print("title is not same");
    	}driver.close();
    }
        }
