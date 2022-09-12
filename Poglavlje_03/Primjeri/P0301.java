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
 * P0301 Primjer potrebe ponavljanja koda, ponavljanje operacija 
 * Program: ispisati brojeve od 1 do 5 i njihove kvadrate
 */
public class P0301 {

    public static void main(String[] args) {

        int i1 = 1;
        int k1 = i1 * i1;

        int i2 = 2;
        int k2 = i2 * i2;

        int i3 = 3;
        int k3 = i3 * i3;

        int i4 = 4;
        int k4 = i4 * i4;

        int i5 = 5;
        int k5 = i5 * i5;

        System.out.printf("Kvadrat broja %d je %d \n", i1, k1);
        System.out.printf("Kvadrat broja %d je %d \n", i2, k2);
        System.out.printf("Kvadrat broja %d je %d \n", i3, k3);
        System.out.printf("Kvadrat broja %d je %d \n", i4, k4);
        System.out.printf("Kvadrat broja %d je %d \n", i5, k5);

    }
}