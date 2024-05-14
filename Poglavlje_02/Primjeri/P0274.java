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
 * P0274
 * Primjer if-elseif-else naredbe
 */
public class P0274 {

    public static void main(String[] args) {

        int a = 2;

        if (a > 3) {
            System.out.println(a + " je vece od 3");
        } else if (a < 3) {
            System.out.println(a + " je manje od 3");
        } else {
            System.out.println(a + " je 3");
        }

    }
}
