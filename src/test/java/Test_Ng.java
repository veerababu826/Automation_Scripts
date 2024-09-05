import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Ng {
	
	@Test()
public static void Excel() throws Exception {
	
        WebDriverManager.chromedriver().setup();
	
	    WebDriver driver=new ChromeDriver();
	
	    driver.get("https://www.facebook.com/");
	
	    driver.manage().window().maximize();
	
	    File f=new File("C:\\Users\\deviv\\eclipse-workspace\\Selenium\\src\\test\\resources\\TestData.xlsx");
	
	    FileInputStream fis=new FileInputStream(f);		
	
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	
     	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	    int rowc=sheet.getLastRowNum();
	
	    for (int i = 0; i <=rowc; i++) {
	
	    XSSFRow currentrow=sheet.getRow(i);
	    
		/*
		 * if (currentrow == null)
		 * 
		 * continue;
		 */
	  
	    String uname = getCellValue(currentrow.getCell(0));
        String pname = getCellValue(currentrow.getCell(1));

	    WebElement emailField =	driver.findElement(By.xpath("//*[@id='email']"));	
	  		
	    WebElement passwordField=	driver.findElement(By.xpath("//*[@id='pass']"));
	  		
	    WebElement   loginbutton=driver.findElement(By.xpath("//*[@type='submit']"));
	  		
	    emailField.sendKeys(uname);

        passwordField.sendKeys(pname);
        
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", loginbutton);
		 */
          
             //   loginbutton.sendKeys(Keys.RETURN); 

	  		
	  			/*
			 * String
			 * error=driver.findElement(By.xpath("//*[text()='Invalid credentials']")).
			 * getText();
			 * 
			 * if(error.equalsIgnoreCase("Invalid credentials']")) {
			 * 
			 * sheet.getRow(i).createCell(2).setCellValue("pass");
			 * 
			 * }else {
			 * 
			 * sheet.getRow(i).createCell(2).setCellValue("fail");
			 * 
			 * }
			 * 
			 * 
			 * FileOutputStream fos=new FileOutputStream(
			 * "C:\\Users\\deviv\\eclipse-workspace\\Selenium\\src\\test\\resources\\TestData.xlsx"
			 * );
			 * 
			 * wb.write(fos);
			 */
	  		
	  		driver.switchTo().newWindow(WindowType.WINDOW);
			
			
       
            driver.get("https://www.facebook.com/");
          
             wb.close();	
             
	  		
	  	     }
    
  
    
        }
	
	       public  static String getCellValue(Cell cell) {
            if (cell == null)
            return "";
            switch (cell.getCellType()) {
            case STRING: return cell.getStringCellValue();
            case NUMERIC: return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            default: return "";
        }
    
    
         }

}


	
	
	
	

