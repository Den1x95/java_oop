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
package Poglavlje10.Primjeri.p1010;

/**
 * Primjer P1012
 * Primjer pozivanja podrazumijevanog konstruktora. Primjetimo kako smo ručno
 * deklarirali podrazumijevani konstruktor.
 */
public class P1012 {

    public static void main(String[] args) {

        Klasa12 k1 = new Klasa12();
        System.out.println(k1);

    }
}

class Klasa12 {

    private int atr;

    Klasa12() {
        atr = 7;
    }

    @Override
    public String toString() {
        return String.format("Objekt atr: %d", atr);
    }

}
