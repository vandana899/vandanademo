 package vandanademo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {
public static String url="https://jqueryui.com/droppable/";
WebDriver driver;

@Test
public void tc1() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	
	driver.findElements(By.tagName("iframe")).size();
	
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
	
	WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();
}




}
