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
package Poglavlje11.Primjeri.P1130.classes;

import Poglavlje11.Primjeri.P1130.interfaces.Jestiv;

public abstract class Hrana implements Jestiv {

    private String ime;
    private int kcal;

    public Hrana(String ime, int kcal) {
        this.ime = ime;
        this.kcal = kcal;
    }

    public String getIme() {
        return ime;
    }

    public int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return String.format("Ime: %s, kcal: %d ", ime, kcal);
    }


}
