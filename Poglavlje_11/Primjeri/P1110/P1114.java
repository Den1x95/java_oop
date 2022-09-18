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
 * Primjer P1114
 * Primjer sortiranja polja.
 */
public class P1114 {

    public static void main(String[] args) {

        ImePrezimeSortPrezime[] osobe = {
            new ImePrezimeSortPrezime(7, "Marko", "Markovic"),
            new ImePrezimeSortPrezime(12, "stanko", "Stankovic"),
            new ImePrezimeSortPrezime(4, "Darko", "Darkovic"),
            new ImePrezimeSortPrezime(5, "janko", "Jankovic")
        };

        Arrays.sort(osobe);
        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
