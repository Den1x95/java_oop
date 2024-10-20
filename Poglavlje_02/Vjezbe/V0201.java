
public class V0201 {

	public static void main(String[] args) {
		
        int a = 0;    // 1 neradni dan ili praznik
                      // 0 radni dan
		
		
		boolean radniDan = (a < 1 );
        boolean praznik = (a > 0);
        
        
		System.out.println("Budilicu ne mozemo iskljuciti jer je radni dan : "
				+ radniDan);
		
		System.out.println(" Budilicu mozemo iskljuciti jer je neradni dan"
				+ " ili praznik : "
				+ praznik);
				

	}

}
