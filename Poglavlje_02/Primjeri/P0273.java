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
 * P0273
 * Primjer ugnježđivanja if naredbi
 */
public class P0273 {

    public static void main(String[] args) {

        int a = 3;

        if (a > 3) {
            System.out.println(a + " je vece od 3");
        }
        else {
            if (a < 3) {
                System.out.println(a + " je manje od 3");
            }
            else {
                System.out.println(a + " je jednako 3");
            }
        }

    }
}
