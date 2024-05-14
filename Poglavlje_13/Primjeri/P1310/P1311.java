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
 * Primjer P1311
 * Primjer iznimke, kod parsiranja broja iz stringa u integer se dogodi
 * greška i izvođenje programa se prekine.
 */
public class P1311 {

    public static void main(String[] args) {

        String broj = "12n";
        int num = Integer.parseInt(broj);
        System.out.printf("Broj je: %d \n", num);

    }
}
