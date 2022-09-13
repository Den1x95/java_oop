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
package Poglavlje10.Primjeri.P1010;


/**
 * Primjer P1013
 * Primjer pozivanja podrazumijevanog konstruktora. Primjetimo kako smo
 * deklarirali konstruktor različit od podrazumijevanog.
 */
public class P1013 {

    public static void main(String[] args){

        Klasa13 k1 = new Klasa13();
        System.out.println("Objekt k1: " + k1.getAtr());

    }

}

class Klasa13 {

    private int atr;

    Klasa13(int a) {
        atr = a;
    }
    Klasa13() {
        atr = 100;
    }

    int getAtr() {
        return atr;
    }

    @Override
    public String toString() {
        return String.format("Objekt atr: %d", atr);
    }

}
