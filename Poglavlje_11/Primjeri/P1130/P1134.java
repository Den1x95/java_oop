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
import Poglavlje11.Primjeri.P1130.classes.Jabuka;
import Poglavlje11.Primjeri.P1130.interfaces.Cookable;

/**
 * Primjer P1134
 * Svojsvo objekta, primjena
 */
public class P1134 {

    public static void main(String[] args){

        Jabuka ap = new Jabuka();
        Cedevita cd = new Cedevita();
        Badem ad = new Badem();

        System.out.println(ap.getIme());
        printRecept(ap);

        System.out.println(cd.getIme());
        printRecept(cd);

        System.out.println(ad.getIme());
        printRecept(ad);

    }

    public static void printRecept(Cookable cb){
        System.out.println(cb.kakoPripremiti());
    }

}
