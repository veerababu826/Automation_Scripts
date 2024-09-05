
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="veera babu";
		
		String[] s1=s.split(" ");
		
		String s3="";
		
		for (String s2 : s1) {
			
		for(int i=s2.length()-1;i>=0;i--) {
				
		s3=s3+s2.charAt(i);
				
		}
			
		s3=s3+" ";
			
		}
		
		System.out.println(s3);

	}

}
