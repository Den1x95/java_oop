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
 * P0341 Primjer naredbe break. Naredba break se koristi samo unutar petlje za
 * prijevremeni/kontrolirani izlazak iz petlje.
 */
public class P0341 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {

            System.out.println("Prolazak br: " + i);
            if (i == 3) {
                break;
            }
            i = i + 1;

        }

    }
}
