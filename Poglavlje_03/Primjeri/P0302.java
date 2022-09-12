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
 * P0302 Primjer potrebe ponavljanja koda, grupiranje istih operacija 
 * Program: ispisati brojeve od 1 do 5 i njihove kvadrate
 */
public class P0302 {

    public static void main(String[] args) {

        int i = 0;
        int k;

        i = i + 1;
        k = i * i;
        System.out.printf("Kvadrat broja %d je %d \n", i, k);

        i = i + 1;
        k = i * i;
        System.out.printf("Kvadrat broja %d je %d \n", i, k);

        i = i + 1;
        k = i * i;
        System.out.printf("Kvadrat broja %d je %d \n", i, k);

        i = i + 1;
        k = i * i;
        System.out.printf("Kvadrat broja %d je %d \n", i, k);

        i = i + 1;
        k = i * i;
        System.out.printf("Kvadrat broja %d je %d \n", i, k);

    }
}