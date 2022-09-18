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

public class ImePrezimeSortId extends ImePrezime implements Comparable {

    public ImePrezimeSortId(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public int compareTo(Object referenca) {

        return getId() - ((ImePrezimeSortId) referenca).getId();
    }
}
