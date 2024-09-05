
public class Recursion {
	
	public static void main(String[] args) {
		
		m1(1,10);
		
	}
	
	public static void m1(int x,int y) {
		
		if(x<=y) {
			
		if(x%2==0) {
			
			System.out.println(x);
			
		
		}
		
		m1(x+1,y);
		
		
	}

}
	
}
