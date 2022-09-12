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
 * P0254
 * Primjer operatora pridruživanja
 */
public class P0254 {

    public static void main(String[] args) {

        int a = 30;
        int b = 30;

        a = a + 30;
        b += 30;

        System.out.println("a = " + a + "\nb = " + b);

    }
}