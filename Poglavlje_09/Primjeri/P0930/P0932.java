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

import Poglavlje09.Primjeri.p0930.klase.AlanFordLikKojiGovori;

/**
 * Primjer P0932
 * Primjer prikrivanja metode toString();
 */
public class P0932 {

    public static void main(String[] args) {

        AlanFordLikKojiGovori likSuperhik = new AlanFordLikKojiGovori();
        likSuperhik.setImeGrupa("Superhik", "Bilo koja, samo da nije TNT");

        System.out.println(likSuperhik);

    }
}
