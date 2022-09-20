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

import java.io.Serializable;

public class Kontakt implements Serializable {

    Adresa kuca;
    Adresa posao;

    public Kontakt(Adresa kuca, Adresa posao) {
        this.kuca = kuca;
        this.posao = posao;
    }

    public Adresa getKuca() {
        return kuca;
    }

    public Adresa getPosao() {
        return posao;
    }

    @Override
    public String toString() {
        return String.format("home: %s\nwork: %s", kuca, posao);
    }
}
