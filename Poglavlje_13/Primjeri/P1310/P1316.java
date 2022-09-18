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
package Poglavlje13.Primjeri.P1310;

/**
 * Primjer P1316
 * Ukoliko želimo da se neke naredbe sigurno izvrše, bez obzira da li je
 * došlo od iznimke ili ne navodimo ih u finally blok koji se piše na
 * samom kraju, iza svih catch blokova.
 */
public class P1316 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String element = "3";

        try {
            int br = Integer.parseInt(element);
            int zadnji = brojevi[br];
            System.out.printf("Zadnji broj je: %d", zadnji);
        } finally {
            System.out.printf("Kako god bilo, ja se izvršim. \n");
        }

    }
}
