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
package Poglavlje10.Primjeri.P1030;

/**
 * Primjer P1032
 * Primjer statičkog inicijalizacijskog bloka
 */
public class P1032 {

    public static void main(String[] args) {


        System.out.println("Atribut klase: " + Klasa32.KONST);

        Klasa32 k1 = new Klasa32(23, "Neki string");
        System.out.printf("k1: %s\n", k1);

    }
}

class Klasa32 {

    public static final int KONST;

    static {
        KONST = 235;
    }

    private int atr1;
    private String atr2;

    public Klasa32(int a1, String a2) {
        super();
        atr1 = a1;
        atr2 = a2;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, KONST: %d", atr1, atr2, KONST);
    }
}