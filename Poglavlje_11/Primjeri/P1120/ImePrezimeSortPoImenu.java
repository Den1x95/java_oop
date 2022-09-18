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

import java.util.Comparator;
import Poglavlje11.Primjeri.P1110.ImePrezimeSortPrezime;

/**
 * Komparator klasa za sortiranje dva objekta
 */
public class ImePrezimeSortPoImenu implements Comparator {

    public int compare(Object o1, Object o2) {

        String prvoIme = ((ImePrezimeSortPrezime) o1).getIme().toLowerCase();
        String drugoIme = ((ImePrezimeSortPrezime) o2).getIme().toLowerCase();

        return prvoIme.compareTo(drugoIme);
    }
}
