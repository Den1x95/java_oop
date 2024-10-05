
public class V0202 {

	public static void main(String[] args) {
		
		
		int a = 0;     // 0 predstavlja kad se nesmiju a 1 kad se smiju
		int b = 0;
		
		
			boolean majmunJedan = (a <= 1);
			boolean majmunDva = (b <= 1);
			boolean max = (a >= 1 & b >= 1);
			
			
			
			System.out.println(" Majmuni se smiju / nesmiju " + (majmunJedan & majmunDva) + " \n Samo jedan se smije "+ max);

		
		
}
}