package vandanademo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class droppable {
	public static String url="https://the-internet.herokuapp.com/nested_frames";
	WebDriver driver;

	@Test
	public void tc1() throws InterruptedException, FileNotFoundException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
//		driver.findElements(By.xpath("//*[@row='50%,50%']")).size();
//	System.out.print(driver.findElements(By.xpath("//*[@name='frameset-middle']")).size());
//		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
////		
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frameset-middle']")));
////		driver.switchTo().frame(driver.findElement(By.name("frame-left")));
//WebElement ele =driver.findElement(By.name("frame-middle"));
//		
//	String text=ele.getText();
//	System.out.print("text");
//		driver.close();
		
		driver.findElements(By.tagName("frameset")).size();
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		System.out.println(driver.findElements(By.tagName("frame")).size());
		Thread.sleep(3000);
		System.out.println("driver in frame top");
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		System.out.println("driver in middle frame");
		WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]"));
		System.out.println(text.getText());	
		
		PrintStream ps = new PrintStream(new File("C:\\Users\\hp\\Desktop\\demo\\console.txt"));
		 System.setOut(ps);
		 ps.print("india");
		
}
}
