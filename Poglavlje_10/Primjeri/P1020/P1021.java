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
package Poglavlje10.Primjeri.P1020;


/**
 * Primjer P1021
 * Primjer ovlerloadanja konstruktora.
 */
public class P1021 {

    public static void main(String[] args) {

        Klasa21 k1 = new Klasa21(8);
        Klasa21 k2 = new Klasa21(12, "Neki string");

        System.out.println(k1);
        System.out.println(k2);

    }
}

class Klasa21 {

    private int atr1;
    private String atr2;

    public Klasa21(int atr1) {
        this.atr1 = atr1;
        this.atr2 = "not set";
    }

    public Klasa21(int atr1, String atr2) {
        this.atr1 = atr1;
    }

    @Override
    public String toString() {
        return String.format("Objekt: %d, %s", atr1, atr2);
    }
}
