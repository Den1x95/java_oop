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
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer P1312
 * Primjer hvatanja iznimke kod parsiranja broja iz stringa u integer se
 * može pojaviti iznimka NumberFormatException
 */
public class P1312 {

    public static void main(String[] args) {

        String broj = "12n";

        try {
            int num = Integer.parseInt(broj);
            System.out.printf("Broj je: %d \n", num);
        }
        catch(NumberFormatException ex) {
            System.out.println("Parsiranje broja nije uspjelo: \n"
                    + ex);
        }

        System.out.println("Program gotov!");

    }
}
