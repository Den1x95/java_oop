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
package Poglavlje15.Primjeri.P1530;

public class KontaktParanoid extends Kontakt {

    private transient Adresa trenutnaLokacija;

    public KontaktParanoid(Adresa kuca, Adresa posao, Adresa trenutnaLokacija) {
        super(kuca, posao);
        this.trenutnaLokacija = trenutnaLokacija;
    }

    @Override
    public String toString() {
        return String.format("home: %s\nwork: %s\nloc: %s", 
                kuca, posao, trenutnaLokacija);
    }
}
