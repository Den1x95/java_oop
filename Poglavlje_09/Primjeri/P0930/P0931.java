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
package Poglavlje09.Primjeri.P0930;

import Poglavlje09.Primjeri.P0930.klase.AlanFordLik;

/**
 * Primjer P0931
 * Primjer nasljeđivanja klase Object i metode toString();
 */
public class P0931 {

    public static void main(String[] args) {

        AlanFordLik likBob = new AlanFordLik();
        likBob.setImeGrupa("Bob Rock", "TNT");

        System.out.println("Ime klase: " + likBob.getClass().getName());
        System.out.println("Ime paketa: " + likBob.getClass().getPackage());

        System.out.println("Objekt: " + likBob);
        System.out.printf("Stanje objekta: %s, %s \n",
                likBob.getIme(), likBob.getGrupa());

    }
}
