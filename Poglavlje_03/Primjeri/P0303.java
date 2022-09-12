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
 * P0303 Primjer potrebe ponavljanja koda, koristenje petlje
 */
public class P0303 {

    public static void main(String[] args) {

        int i;
        int k;

        i = 0;

        while (i < 5) {
            i = i + 1;
            k = i * i;
            System.out.printf("Kvadrat broja %d je %d \n", i, k);
        }

    }
}