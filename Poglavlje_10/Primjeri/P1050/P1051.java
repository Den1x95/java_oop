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
package Poglavlje10.Primjeri.P1050;

/**
 * Primjer P1051
 * Primjer apstraktne klase sa apstraktnom metodom.
 */
public class P1051 {

    public static void main(String[] args) {

        Zivotinja jurka = new Purica(true, "Jurka");
        Ptica surka = new Purica(false, "Surka");

        System.out.println(jurka.getIme() + " kaže " + jurka.govori());
        System.out.println(surka.getIme() + " je jestiva: " + surka.isEatable());

    }
}
