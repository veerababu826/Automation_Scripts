
public class occurance1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="veerababu";
		
		String s1="";
		
    	for(int i=0;i<s.length();i++) {
			
		char ch=s.charAt(i);		
		
		int index=s.indexOf(ch,i+1);
		
		if(index==-1) {
			
			s1=s1+ch;
			
		}
		
		}
		
		System.out.println(s1);
		
	

}
	
}
