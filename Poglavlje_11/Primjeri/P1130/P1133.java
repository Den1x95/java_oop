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
import Poglavlje11.Primjeri.P1130.classes.Hrana;
import Poglavlje11.Primjeri.P1130.classes.Jabuka;
import Poglavlje11.Primjeri.P1130.interfaces.Cookable;
import Poglavlje11.Primjeri.P1130.interfaces.Jestiv;

/**
 * Primjer P1133
 * Svojsvo objekta definirano suceljem koje implementira
 */
public class P1133 {

    public static void main(String[] args) {

        Hrana[] jela = {
            new Badem(),
            new Jabuka(),
            new Cedevita()
        };

        for (Hrana f : jela) {
            System.out.print("\n\n" + f);
            if (f instanceof Cookable) {
                System.out.printf("\n    pripremiti: %s",
                        ((Cookable) f).kakoPripremiti());
            }
            if (f instanceof Jestiv) {
                System.out.printf("\n    konzumirati: %s",
                        ((Jestiv) f).kakoKonzumirati());
            }
        }


    }
}
