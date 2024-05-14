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
 * P0201
 * Čitanje sa standardnog ulaza pomoću Scannera
 */
public class P0201 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite svoje ime: ");
        String ime = sc.nextLine();

        System.out.printf("Vase ime je: %s", ime);
    }
}