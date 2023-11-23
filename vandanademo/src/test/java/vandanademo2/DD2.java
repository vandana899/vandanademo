package vandanademo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DD2 {
	public String str = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver ;
	
	public String username,password;
	
	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(str);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void test1() throws InterruptedException, IOException {

		File excel =new File("C:\\Users\\hp\\Desktop\\dd.xlsx"); //xsf workbook is used for xlsx //hssf is used for .xls
		
		FileInputStream fis = new FileInputStream(excel); //gets the input
		XSSFWorkbook book = new XSSFWorkbook(fis); // from the work book
		XSSFSheet sheet = book.getSheet("Sheet1");  //from Sheet1
		
		
		int rowcount = sheet.getLastRowNum(); //fetches till the last row
		
		for(int i=0; i<=rowcount; i++) { //from column A of excel goes down one by one to the rows
		String username = sheet.getRow(i).getCell(0).getStringCellValue(); //column A
		String password = sheet.getRow(i).getCell(1).getStringCellValue();  //column B

			System.out.println(username);
			System.out.println(password);
			
			
		driver.findElement(By.name("username")).sendKeys(username);
			
			Thread.sleep(3000);
			
			 driver.findElement(By.name("password")).sendKeys(password);
			
			Thread.sleep(3000);
			
			
			
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			

			Thread.sleep(3000);
			
			
			
			
		}
	}
	
	
	
	
	
	
	
	
	
}




