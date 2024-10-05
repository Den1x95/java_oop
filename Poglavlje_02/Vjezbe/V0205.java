import java.util.Scanner;

public class V0205 {

	public static void main(String[] args) {
		
		int godina;
		boolean prijestupna = false;
		System.out.println("Unesi godinu : ");
		Scanner sc = new Scanner(System.in);
		godina = sc.nextInt();
		
		if(godina % 4 == 0) {
			if (godina % 100 == 0) {
				if (godina % 400 == 0 )
					
					prijestupna = true;
				else
					prijestupna = false;
			}
			prijestupna = true;
		}
		else
			prijestupna = false;
		
		System.out.println(godina + " Je prijestupna? : " + prijestupna);
		
					
			}
		
					
	}

