
public class Z0205 {

	public static void main(String[] args) {
		
		int magarac1 = 1;   //0 predstavlja kad magarac ne pije
		int magarac2 = 0;   //1 predstavlja kad magarac pije
		
		
		boolean zednost =  magarac1 < 1 ;
		boolean zednost2 = magarac2 < 1 ;
		boolean vodostajBunara =  magarac1 + magarac2 > 1 ;
		
		System.out.println("Trenutno piju oba magarca vodu : " 
				+ vodostajBunara );
		
		if (magarac1 < 1) {
			System.out.println("Trenutno pije samo jedan magarac vodu : " 
					+ zednost);
		}else if (magarac2 < 1) {
			System.out.println("Trenutno pije sam jedan magarac vodu : "
					+ zednost2);
		}
		
		
		
		
	}

}
