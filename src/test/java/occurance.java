
public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="aaaabbbccccaaadd";
		
		char s2=s.charAt(0);
		
		int count = 1;
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<=s.length()-1;i++) {
			
			if(s.charAt(i)==s2) {
				
				
				count++;
				
		}else {
			
			 sb.append(s2).append(count);
               // Reset for the next character
               s2 = s.charAt(i);
               count = 1;
			
			
				}
			
			
				}
		
		
		 sb.append(s2).append(count);
		 
		 
		  System.out.println(sb.toString());
		
		
		
		

	}

}
