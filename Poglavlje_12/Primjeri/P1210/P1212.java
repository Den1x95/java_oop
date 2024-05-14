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
package Poglavlje12.Primjeri.P1210;

/**
 * Primjer P1212
 * Primjer korištenja enum varijable u switch/case naredbi
 */
public class P1212 {

    public static void main(String[] args) {
        Boja b = Boja.PLAVA;
        String s = "";

        switch(b) {
        case CRVENA:
            s = "Crvena boja";
            break;
        case PLAVA:
            s = "Plava boja";
            break;
        case ZELENA:
            s = "Zelena boja";
            break;
        case ZUTA:
            s = "Zuta boja";
            break;
        }

        System.out.println(b + " - " + s);

    }
}
