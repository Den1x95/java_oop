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

import Poglavlje11.Primjeri.P1130.classes.Cedevita;
import Poglavlje11.Primjeri.P1130.classes.Jabuka;
import Poglavlje11.Primjeri.P1130.interfaces.Pitak;

/**
 * Primjer P1132
 * Svojsvo objekta definirano suceljem koje implementira
 */
public class P1132 {

    public static void main(String[] args){

        Pitak d1 = new Jabuka();
        Pitak d2 = new Cedevita();

        System.out.println(d1.kakoKonzumirati());
        System.out.println(d2.kakoKonzumirati());

    }

}
