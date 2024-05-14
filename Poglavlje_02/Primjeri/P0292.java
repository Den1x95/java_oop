/*
 **********************************************************
 *                                                        *
 *       Objektno-orijentirano programiranje u Javi.      *
 *                                                        *
 *             Copyright © 2024 Vedran Novak              *
 *                  www.vedrannovak.com                   *
 *                                                        *
 **********************************************************
 */

/**
 * P0292
 * Primjer switch-case naredbe, break
 */
public class P0292 {

    public static void main(String[] args) {

        int i = 2;

        switch(i) {
			case 1:
				System.out.println("Broj je 1");
				break;
			case 2:
				System.out.println("Broj je 2");
				break;
			default:
				System.out.println("Broj je 5 ili veci");
				break;
			case 3:
				System.out.println("Broj je 3");
				break;
			case 4:
				System.out.println("Broj je 4");
				break;
        }
    }
}
