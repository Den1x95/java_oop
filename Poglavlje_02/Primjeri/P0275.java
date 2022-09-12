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

/**
 * P0275
 * Primjer trajanja varijable, scope
 */
public class P0275 {

    public static void main(String[] args) {             // vanjski blok naredbi

        int a = 6;

        if (true) {                                       // unutarnji blok
            int b = 10;
            System.out.printf("a: %d, b: %d \n", a, b);
        }

        if (a < 5) {                                       // unutarnji blok
            int b = 11;
            System.out.printf("a: %d, b: %d  \n", a, b);
        }
        else {                                          // unutarnji blok
            int b = 12;
            System.out.printf("a: %d, b: %d  \n", a, b);
        }

    }
}
