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
 * P0404 Primjer imena metode i varijable.
 */
class P0404 {

    public static void main(String[] args) {

        int suma = 7;

        suma++;
        suma();
        suma2();
    }

    static void suma() {
        System.out.println("Pozdrav, ja sam metoda suma.");
    }

    static void suma2() {
        System.out.println("Pozdrav, ja sam metoda suma2.");
    }
}
