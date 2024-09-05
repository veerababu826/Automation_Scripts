import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws Exception {
		
		File f=new File("./Sample.txt");
		
		f.createNewFile();
	
           //  f.mkdirs();
		/*
		 * if(f.exists())
		 * 
		 * f.delete();
		 * 
		 * System.out.println(f.createNewFile());
		 */
		}

}
