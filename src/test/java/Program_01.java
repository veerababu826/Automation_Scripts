import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File f=new File("./Sample.txt");
		
		if(!f.exists())
			
		System.out.println(f.createNewFile());
		
		FileInputStream fis= new FileInputStream(f);
		
		int  asciicode;
		
		while((asciicode=fis.read())!=-1){
		  
		System.out.print((char)asciicode);
		  
		  }
		 
		
	
		
		
	}
	
	

}
