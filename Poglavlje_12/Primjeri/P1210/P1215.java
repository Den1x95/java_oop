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
package Poglavlje12.Primjeri.P1210;

/**
 * Primjer P1215
 * Primjer apstraktne metode enum klase
 */
public class P1215 {

    public static void main(String[] args) {

        double d1 = 7;
        double d2 = 12;

        System.out.printf(" %.2f %s %.2f = %.2f \n",
                d1, Operacije.DIJELJENO,
                d2, Operacije.DIJELJENO.apply(d1, d2));

        
        for(Operacije o : Operacije.values()) {
            System.out.printf(" %.2f %s %.2f = %.2f \n",
                    d1, o, d2, o.apply(d1, d2));
        }

    }
}
