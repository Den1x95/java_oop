
public class Z0202 {
	public static void main(String[]args) {

		
		
		int a = 40;
		int b = 50;
		
		boolean interval = (a >= 20 && a<= 30 && b >= 20 && b <= 30
				|| a >= 40 && a <= 50 && b >= 40 && b <= 50);
		
		System.out.println( interval );
	
	}
}