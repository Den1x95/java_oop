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
package Poglavlje11.Primjeri.P1120;

import java.util.Arrays;
import Poglavlje11.Primjeri.p1110.ImePrezimeSortPrezime;

/**
 * Primjer P1122
 * Sortiranje objekata koristeći prirodno sortiranje implementirano metodom
 * compare sučelja Comparator
 */
public class P1122 {

    public static void main(String[] args) {

        ImePrezimeSortPrezime[] osobe = {
            new ImePrezimeSortPrezime(7, "Marko", "Stankovic"),
            new ImePrezimeSortPrezime(12, "stanko", "Darkovic"),
            new ImePrezimeSortPrezime(4, "Darko", "jankovic"),
            new ImePrezimeSortPrezime(5, "janko", "markovic")
        };

        Arrays.sort(osobe, new ImePrezimeSortPoImenu());
        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
