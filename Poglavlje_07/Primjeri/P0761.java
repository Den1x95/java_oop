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

import java.util.Arrays;

/**
 * P0761
 * Klasa Arrays i neke metode klase Arrays za rad s poljima.
 */
class P0761 {

    public static void main(String[] args) {

        int[] polje = {3, 7, 1, 9, 2, 5, 4, 6, 8, 10};
        System.out.println(Arrays.toString(polje));

        Arrays.sort(polje);
        System.out.println(Arrays.toString(polje));

        metodaPolje(5, polje);
        System.out.println(Arrays.toString(polje));

        char[][] pChar = {{'a', 'c'}, {'b', 'g', 'd'}};
        System.out.println(Arrays.deepToString(pChar));

    }

    static void metodaPolje(int faktor, int[] brojevi) {
        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] *= faktor;
        }
    }
}
