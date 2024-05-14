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

public class Macka extends Zivotinja {

    public Macka(String aIme) {
        ime = aIme;
        rod = "Macka";
    }

    @Override
    public String govori() {
        return "Mijau";
    }
}
