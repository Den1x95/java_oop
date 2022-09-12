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
 * P0321 Primjer do-while petlje, petlja ispisuje broj prolazaka.
 */
public class P0321 {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println("Prolazak br: " + i);
            i++; // ovo je isto kao i = i + 1
        } while (i < 5);

    }
}