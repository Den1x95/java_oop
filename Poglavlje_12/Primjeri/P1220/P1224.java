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
package Poglavlje12.Primjeri.P1220;

/**
 * Primjer P1224
 * Pristupanje statičkoj unutarnjoj klasi preko reference Vanjske klase.
 */
public class P1224 {

    public static void main(String[] args) {

        System.out.println(VanjskaKlasa.StaticUnutarnjaKlasa.MEMBER);

    }
}
