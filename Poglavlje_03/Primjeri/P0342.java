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
 * P0342 Primjer naredbe continue, Naredbom continue se vracamo na pocetak
 * petlje i ponovno provjeravanje uvjeta.
 */
public class P0342 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {

            System.out.println("Prolazak br: " + i);
            if (i == 3) {
                continue;
            }
            i = i + 1; // ovu naredbu nikada necemo dohvatiti, beskonacna petlja

        }

    }
}
