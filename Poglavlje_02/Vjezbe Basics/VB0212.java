
public class VB0212 {

	public static void main(String[] args) {

	    int a = 58;
        int b = 60;
        int c = 1;
        int d = 80;
        int max;
        int min;
       
        
        
        
        
       if (a > b && a > c )  {
    	  max = a;
       }
       
       else if(b > c && b > d)  {
    	 max = b; 
       }
        
       else if (c > d ){
    	   max = c;
       }
       
       else {
    	  max = d ;
       }
       
       System.out.println("Najveci br je: " + max );
       
       
       min = (a < b && a < c ) ? a : b;
       min = (a < b && a < c ) ? a : c;
       min = (b < c && b < d ) ? b:c ;
       min = (a < d )? a: c;
       min = (b < a)? b:a ;
       min = (b < d)? b:d;
       min = (c < d)? c:d; 
       
      
       System.out.println("Najmanj broj je: " + min);

	}

}
