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

package Poglavlje09.Primjeri.P0920;

import Poglavlje09.Primjeri.p0920.klase.Spiderman;
import Poglavlje09.Primjeri.p0920.klase.SuperHeroj;
import Poglavlje09.Primjeri.p0920.klase.Superman;

/**
 * Primjer P0922
 * Private atributi i metode se ne prenose u podklase, a final metode nije
 * moguće prikriti (override).
 *
 * Metoda getIme nije private te svaka klasa koja nasljeđuje klasu SuperHeroj
 * ima metodu getIme, no atribut ime klase SuperHeroj je private.
 */
public class P0922 {

    public static void main(String[] args) {

        SuperHeroj heroj = new SuperHeroj();
        Superman spam = new Superman();
        Spiderman spider = new Spiderman();

        System.out.println(heroj.getIme());
        System.out.println(spam.getIme() + spam.getMojeIme());
        System.out.println(spider.getIme() + spider.getMojeIme());

    }
}
