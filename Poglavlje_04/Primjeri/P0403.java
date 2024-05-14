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
 * P0403 Primjer pozivanja metode je naredba koja sadrzi ime metode i
 * vrijednosti parametara u zagradama. Ukoliko metoda nema parametre, moraju se
 * navesti prazne zagrade.
 */
class P0403 {

    public static void main(String[] args) {
        int a = 2;
        imeMetode(a);
    }

    static void imeMetode(int a) {
        System.out.println("Pozdrav, javljam se iz metode.");
    }
}
