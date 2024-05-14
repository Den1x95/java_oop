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
 * P0281
 * Primjer: ternarni operator: grananje sa if-then-else naredbom, usporedbom
 * varijabli želimo naći veći broj.
 */
public class P0281 {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("Veci broj je: " + max);

        max = (a > b) ? a : b;
        System.out.println("Veci broj je: " + max);

    }
}
