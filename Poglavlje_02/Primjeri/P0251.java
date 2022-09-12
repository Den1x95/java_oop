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
 * P0251
 * Primjer aritmetičkih operatora
 */
public class P0251 {

    public static void main(String[] args) {

        int a = 30;
        long b = 40;
        double d = 32.14;
        float f = 12.5f;

        int ostatak = (int)(b % a);

        System.out.println("Ostatak djeljenja " + b + " i " + " a "
                + " je jednak " + ostatak);

        System.out.println("Umnozak brojeva " + d + " i " + f
                + " je jednak " + (d * f));

    }
}