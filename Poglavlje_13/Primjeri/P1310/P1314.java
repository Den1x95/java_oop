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
package Poglavlje13.Primjeri.P1310;

/**
 * Primjer P1314
 * Možemo uhvatiti i više različitih iznimki navodeći catch blokove jedan
 * ispod drugoga.
 */
public class P1314 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String index = "7htzuj";

        try {
            int br = Integer.parseInt(index);
            int element = brojevi[br];
            System.out.printf("Zadnji broj je: %d", element);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.printf("Nemamo toliko elemenata. \n");
        }
        catch(NumberFormatException ex) {
            System.out.println("Parsiranje broja nije uspjelo: \n"
                    + ex.getMessage());
        }

    }
}
