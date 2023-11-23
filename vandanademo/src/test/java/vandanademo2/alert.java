package vandanademo2;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
	public static  String url="https://demoqa.com/alerts/";
    WebDriver driver;
    @BeforeTest
    public void bd() throws InterruptedException, IOException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get(url);
        driver.manage().window().maximize();
    }
    @Test(enabled=true,priority=0)
	public void alert() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		System.out.println("click me button clicked");
		Alert alt=driver.switchTo().alert();
		//String at=alt.getText();
		alt.accept();
		System.out.println("clicked on alert");
		
	}
	@Test(enabled=true,priority=1)
	public void alert2() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		System.out.println("click me button clicked");
		Alert alt1=driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(3000);
		System.out.println("clicked on alert");
		Thread.sleep(5000);
		
	}
	@Test(enabled=true,priority=2)
	public void alert3() throws InterruptedException{
		Thread.sleep(6000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		System.out.println("click me button clicked");
		Alert alt3=driver.switchTo().alert();
		alt3.accept();
		Thread.sleep(3000);
		System.out.println("clicked on alert");
		Thread.sleep(3000);
	}
	@Test(enabled=true,priority=3)
	public void alert4() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		System.out.println("button clicked");
		Alert alt4=driver.switchTo().alert();
		alt4.sendKeys("vandana");
		alt4.accept();
		Thread.sleep(3000);
		
	}
}









