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
 * Primjer P1113
 * Primjer sortiranja polja.
 */
public class P1113 {

    public static void main(String[] args) {

        ImePrezimeSortId[] osobe = {
            new ImePrezimeSortId(7, "Marko", "Markovic"),
            new ImePrezimeSortId(12, "stanko", "Stankovic"),
            new ImePrezimeSortId(4, "Darko", "darkovic"),
            new ImePrezimeSortId(5, "janko", "jankovic")
        };

        Arrays.sort(osobe);
        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
