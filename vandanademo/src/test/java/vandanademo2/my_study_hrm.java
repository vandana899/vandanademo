package vandanademo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class my_study_hrm {
public static String vv="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
WebDriver driver;
@BeforeTest
public void BT() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(vv);
}
@Test
public void vv1() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
@Test
public void vv2() {
	List <WebElement> nana= driver.findElements(By.tagName("a"));
	System.out.println(nana.size());
	//checking for working links
	for (int i=0;i<nana.size();i++) {
		System.out.println(nana.get(i).getText());
		System.out.println(nana.get(i).getAttribute("href"));
	}
}
@Test
public void vv3() throws InterruptedException {
	Thread.sleep(2000);
	List <WebElement> baba= driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
	Thread.sleep(2000);
	System.out.print(baba.size());
	  Actions act = new Actions(driver);
	  WebElement mum=driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(2);
	  act.click(mum).build().perform();
	  WebElement mum2=driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(2);
	  act.click(mum2).build().perform();
	  driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//	  act.click(mum3).build().perform();
//	  Thread.sleep(2000);
}
@Test
public void vv4() {
	driver.findElement(By.xpath("//*[@class='oxd-userdropdown']//i")).click();
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
}











}
