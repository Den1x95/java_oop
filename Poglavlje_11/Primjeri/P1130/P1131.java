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
package Poglavlje11.Primjeri.P1130;

import Poglavlje11.Primjeri.P1130.classes.Badem;
import Poglavlje11.Primjeri.P1130.classes.Cedevita;
import Poglavlje11.Primjeri.P1130.interfaces.Jestiv;

/**
 * Primjer P1131
 * Svojsvo objekta definirano suceljem koje implementira
 */
public class P1131 {

    public static void main(String[] args) {

        Jestiv d1 = new Badem();
        Jestiv d2 = new Cedevita();

        System.out.println(d1.kakoKonzumirati());
        System.out.println(d2.kakoKonzumirati());

    }
}
