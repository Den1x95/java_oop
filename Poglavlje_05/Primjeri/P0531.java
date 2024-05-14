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

import java.util.Scanner;

/**
 * P0531 Primjer koristenja Scanner klase
 */
public class P0531 {

    public static void main(String[] args) {

        Scanner scString = new Scanner("niz znakova      koje treba 23 puta analizirati");
        int broj = 0;

        while (scString.hasNext()) {

            if (scString.hasNextInt()) {
                broj += scString.nextInt();
            } else {
                System.out.println(scString.next());
            }

        }

        System.out.println("Broj: " + broj);
        scString.close();
    }
}
