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
package Poglavlje12.Primjeri.P1210;

import java.util.Arrays;

/**
 * Primjer P1213
 * Primjer values() metode klase java.lang.Enum
 */
public class P1213 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Boja.values()));

        for(Boja b : Boja.values()) {
            System.out.printf("Instanca %s je %s \n", b, getOpisBoja(b));
        }

    }

    private static String getOpisBoja(Boja b) {

        switch(b) {
        case CRVENA:
            return "Crvena boja";
        case PLAVA:
            return "Plava boja";
        case ZELENA:
            return "Zelena boja";
        case ZUTA:
            return "Zuta boja";
        }
        return "";

    }
}
