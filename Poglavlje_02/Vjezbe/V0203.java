
public class V0203 {

	public static void main(String[] args) {
	
			double temp1 = -1;
			double temp2 = 101;
			
			boolean temp = (temp1 < 0 && temp2 > 100);
			boolean tempm =(temp1 > 100 && temp2 < 0);
			
			System.out.println("Vrijednos je " + (temp || tempm));
			
	}

}
