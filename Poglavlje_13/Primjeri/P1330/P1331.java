/*
 **********************************************************
 *                                                        *
 *       Objektno-orijentirano programiranje u Javi.      *
 *                                                        *
 *             Copyright © 2022 Vedran Novak              *
 *                  www.vedrannovak.com                   *
 *                                                        *
 **********************************************************
 */
package Poglavlje13.Primjeri.P1330;

/**
 * Primjer P1331
 * Assertions.
 */
public class P1331 {

	public static void main(String[] args){
		System.out.println("Dijeli: " + podijeli(2,1));
                vratiBroj(-1);
                //nekiTest(4);
                
	}

	static double podijeli(double a, double b) {
		assert (b != 0) : "greška, b==0";
		return a/b;
	}

        static void vratiBroj(int broj){
            
            assert( broj >= 0 && broj <= 20 ) : "Invalid number: " + broj;
        }

	static void nekiTest(int stanje){
		switch(stanje) {
			case 1: /*napravi nesto*/ break;
			case 2: /*napravi nesto*/ break;
			case 3: /*napravi nesto*/ break;
			default: assert false : "katastrofa";
		}
	}

}


