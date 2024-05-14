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
package Poglavlje09.Primjeri.P0920;

import Poglavlje09.Primjeri.p0920.klase.Spiderman;
import Poglavlje09.Primjeri.p0920.klase.SuperHeroj;
import Poglavlje09.Primjeri.p0920.klase.Superman;

/**
 * Primjer P0923
 * Primjer skrivanja nasljeđenih metoda i atributa nadklase..
 */
public class P0923 {

    public static void main(String[] args) {

        SuperHeroj heroj = new SuperHeroj();
        Superman spam = new Superman();
        Spiderman spider = new Spiderman();

        System.out.println(heroj.getPrezime());
        System.out.println(spam.getPrezime());
        System.out.println(spider.getPrezime());

    }
}
