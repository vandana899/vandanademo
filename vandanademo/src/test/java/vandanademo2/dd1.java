package vandanademo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class dd1 {
	WebDriver wd;
	public String username2, password2 ;
	
	public String URL="https://opensource-demo.orangehrmlive.com/";
	@BeforeTest
	public void BT() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	wd = new ChromeDriver();
	wd.get(URL);
	Thread.sleep(3000);
	}
	  @Test
	  public void datadriven() throws IOException, InterruptedException {
	File excel =new File("C:\\Users\\hp\\Desktop\\dd.xlsx"); //xsf workbook is used for xlsx //hssf is used for .xls
	
	FileInputStream fis = new FileInputStream(excel); //gets the input
	XSSFWorkbook book = new XSSFWorkbook(fis); // from the work book
	XSSFSheet sheet = book.getSheet("Sheet1");  //from Sheet1
	
	
	int rowcount = sheet.getLastRowNum(); //fetches till the last row
	
	for(int i=0; i<=rowcount; i++) { //from column A of excel goes down one by one to the rows
	String username1 = sheet.getRow(i).getCell(0).getStringCellValue(); //column A
	String password1 = sheet.getRow(i).getCell(1).getStringCellValue();  //column B
	
	wd.findElement(By.name("username")).sendKeys(username1);
	wd.findElement(By.name("password")).sendKeys(password1);
	wd.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(3000);
}
	  }
}
	  