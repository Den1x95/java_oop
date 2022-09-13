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
package Poglavlje10.Primjeri.P1050;

abstract class Zivotinja {

    protected String rod;
    protected String ime;

    public abstract String govori();

    public String getIme() {
        return ime;
    }

    public String getRod() {
        return rod;
    }

    @Override
    public String toString() {
        return rod + " " + ime;
    }
}
