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

/**
 * P0262
 * Primjer automatske promocije tipa podataka.
 */
public class P0262 {

    public static void main(String[] args) {

        byte a = 8;
        byte b = 5;

        byte c = (byte)(a + b);
        /* a i b su promovirani u int, te je rezultat ove operacije int */

        byte d = (byte)(a + b);
        /* ručni cast, ovo je ok */

        System.out.println("Vrijednost a: " + (a));
        System.out.println("Vrijednost b: " + (b));
        System.out.println("Vrijednost c: " + (c));
        System.out.println("Vrijednost d: " + (d));

    }
}