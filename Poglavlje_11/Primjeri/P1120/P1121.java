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
package Poglavlje11.Primjeri.P1120;

import java.util.Arrays;
import Poglavlje11.Primjeri.p1110.ImePrezimeSortPrezime;

/**
 * Primjer P1121
 * Sortiranje objekata koristeći prirodno sortiranje implementirano metodom
 * compareTo sučelja Comparable
 */
public class P1121 {

    public static void main(String[] args) {

        ImePrezimeSortPrezime[] osobe = {
            new ImePrezimeSortPrezime(7, "Marko", "Markovic"),
            new ImePrezimeSortPrezime(12, "stanko", "Stankovic"),
            new ImePrezimeSortPrezime(4, "Darko", "darkovic"),
            new ImePrezimeSortPrezime(5, "janko", "jankovic")
        };

        Arrays.sort(osobe);
        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
