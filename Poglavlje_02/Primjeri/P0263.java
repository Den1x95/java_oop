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
 * P0263
 * Primjer ručne promocije, gubitak preciznosti
 */
public class P0263 {

    public static void main(String[] args) {

        byte a = 85;
        byte b = 55;

        byte d = (byte)(a + b);     // rucni cast, svjesni smo gubitka preciznosti

        System.out.println("Vrijednost a: " + (a));
        System.out.println("Vrijednost b: " + (b));
        System.out.println("Vrijednost d: " + (d));

    }
}