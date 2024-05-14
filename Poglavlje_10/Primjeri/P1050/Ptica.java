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
package Poglavlje10.Primjeri.P1050;

abstract class Ptica extends Zivotinja {

    private boolean eatable;

    public Ptica(boolean eatable) {
        this.eatable = eatable;
    }

    public boolean isEatable() {
        return eatable;
    }

    @Override
    public String govori() {
        return "ćip";
    }
}
