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

public class ImePrezimeSortPrezime extends ImePrezime implements Comparable {

    public ImePrezimeSortPrezime(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public int compareTo(Object o) {

        String mojePrezime = this.getPrezime();
        String tudjePrezime = ((ImePrezimeSortPrezime) o).getPrezime();
        return mojePrezime.compareTo(tudjePrezime);

    }
}
