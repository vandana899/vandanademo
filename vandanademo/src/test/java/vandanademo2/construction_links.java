package vandanademo2;

import java.io.IOException;
import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class construction_links {
	public static  String url="https://demo.guru99.com/test/newtours/";
    WebDriver driver;
    @BeforeTest
    public void bd() throws InterruptedException, IOException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get(url);
        driver.manage().window().maximize();
        
    }
        @Test
        public void bd2() throws InterruptedException {
        	
        	String beforelogin =driver.getTitle();
    		Thread.sleep(5000);
    		//capturing links from the webpage
    	    driver.findElement(By.name("userName")).sendKeys("user");
    	    driver.findElement(By.name("password")).sendKeys("user");
        	driver.findElement(By.name("submit")).click();
    		//WebElement t=driver.findElements(By.xpath("//*[text()='mouseOut']")).get(2);
    		//t.click();
    		List<WebElement> li= driver.findElements(By.tagName("a"));
    		System.out.println(li.size());   //number of links
    	
    		for(int i=0;i<li.size();i++){
    		String str= li.get(i).getAttribute("href");
    		String str1="https://demo.guru99.com/test/newtours/support.php";
    		
    		if(str.equals(str1))
    		{
    			System.out.println("the link under construction "+li.get(i).getText());
    		}
    		else
    		{
    			System.out.println("the link is working "+li.get(i).getText());
    		}
    }
}
}

