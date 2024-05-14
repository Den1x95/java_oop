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

/**
 * P0264
 * Promocija u najveći tip unutar constant izraza
 */
public class P0264 {

    public static void main(String[] args) {

        int a = 85;
        float b = 55.2F;
        double c = 42.7;

        double d = (a + b + c);

        System.out.println("Vrijednost a: " + (a));
        System.out.println("Vrijednost b: " + (b));
        System.out.println("Vrijednost c: " + (c));
        System.out.println("Vrijednost d: " + (d));

    }
}