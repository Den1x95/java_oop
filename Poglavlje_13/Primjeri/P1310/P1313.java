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
package Poglavlje13.Primjeri.P1310;

/**
 * Primjer P1313
 * Neke iznimke nema smisla hvatati, pustimo ih jer ukazuju na grešku u
 * programu.
 */
public class P1313 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};

        try {
            int zadnji = brojevi[brojevi.length ];
            System.out.printf("Zadnji broj je: %d", zadnji);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.printf("Ups, frka");
        }
        System.out.printf("Ups, frka");

    }
}
