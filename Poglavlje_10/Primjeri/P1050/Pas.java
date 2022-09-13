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

public class Pas extends Zivotinja {

    public Pas(String aIme) {
        ime = aIme;
        rod = "Pas";
    }

    @Override
    public String govori() {
        return "Vau";
    }
}
