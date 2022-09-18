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
package Poglavlje11.Primjeri.P1110;

import java.util.Arrays;

/**
 * Primjer P1112
 * Primjer neuspješnog pokušaja sortiranja polja.
 */
public class P1112 {

    public static void main(String[] args) {

        ImePrezime[] osobe = {
            new ImePrezime(7, "Marko", "Markovic"),
            new ImePrezime(12, "stanko", "Stankovic"),
            new ImePrezime(4, "Darko", "darkovic"),
            new ImePrezime(5, "janko", "jankovic")
        };

        Arrays.sort(osobe);
        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
