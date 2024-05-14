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
package Poglavlje11.Primjeri.P1110;

import java.util.Arrays;

/**
 * Primjer P1111
 * Primjer kreiranja polja i ispisivanja elemenata polja. Elementi polja se
 * ispisuju pomoću Arrays.toString metode i to poredani po indeksu  polju.
 */
public class P1111 {

    public static void main(String[] args) {

        ImePrezime[] osobe = {
            new ImePrezime(7, "Marko", "Markovic"),
            new ImePrezime(12, "stanko", "Stankovic"),
            new ImePrezime(4, "Darko", "darkovic"),
            new ImePrezime(5, "janko", "jankovic")
        };

        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
