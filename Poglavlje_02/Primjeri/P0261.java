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
 * P0261
 * Primjer korištenja cast operatora i promocije tipa podatka
 */
public class P0261 {

    public static void main(String[] args) {

        int i = 359;
        double d = i;       // automatsko: promocija tipa podatka iz int u double
        byte b = (byte)i;   // rucno: potreban je cast jer gubimo dio informacije

        System.out.println("Vrijednost i: " + (i));
        System.out.println("Vrijednost d: " + (d));
        System.out.println("Vrijednost b: " + (b));

    }
}