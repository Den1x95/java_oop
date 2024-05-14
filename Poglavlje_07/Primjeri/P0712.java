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
 * P0712
 * Svojstva polja: prvi element, zadnji element, dužina polja
 */
class P0712 {

    public static void main(String[] args) {

        int[] polje = new int[10];

        int prviElement = polje[0];
        int zadnjiElement = polje[9];

        int duljinaPolja = polje.length;

        System.out.format("Prvi element polja: %d \n"
                + "Zadnji element polja: %d \n"
                + "Duljina polja: %d \n",
                prviElement, zadnjiElement, duljinaPolja);

    }
}
