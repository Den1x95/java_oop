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
 * P0265
 * Primjer odbacivnja decimalnog dijela izračunatog izraza, računska operacija
 * s dva int broja rezultira s int brojem.
 */
public class P0265 {

    public static void main(String[] args) {

        System.out.println("Rezultat1: " + (7 / 3));
        System.out.println("Rezultat2: " + (double)(7 / 3));
        System.out.println("Rezultat3: " + (7. / 3));

    }
}