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
 * Primjer P0921
 * Primjer prikazuje overriding metoda. Primjetimo kako sva tri objekta
 * pozivaju metodu istog imena, ali sa rezličitim povratnim rezultatima.
 */
public class P0921 {

    public static void main(String[] args) {

        SuperHeroj heroj = new SuperHeroj();
        Superman spam = new Superman();
        Spiderman spider = new Spiderman();

        System.out.println(heroj.mojProgram());
        System.out.println(spam.mojProgram() + spam.mojSuperProgram());
        System.out.println(spider.mojProgram());

    }
}
