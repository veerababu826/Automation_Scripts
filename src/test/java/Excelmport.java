import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelmport {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
    	File f=new File("C:\\Users\\deviv\\eclipse-workspace\\Selenium\\src\\test\\resources\\TestData.xlsx");
    	
    	FileInputStream fis=new FileInputStream(f);		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rowc=sheet.getLastRowNum();
		
		int col=sheet.getRow(0).getLastCellNum();
		
	    for (int i = 1; i <=rowc; i++) {
		
		  XSSFRow currentrow=sheet.getRow(i);
		
		   for(int j=0;j<=col-1;j++) {
			
			String value=currentrow.getCell(j).toString();
			
			System.out.print("!!"+value);
			
			System.out.println("veera1");
			
			
				}
		   
		   System.out.println();
		   }
	    }

		}


