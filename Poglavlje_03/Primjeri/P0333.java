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
 * P0333 Primjer koristenja vise kontrolnih varijabli, uvjeta i operacija
 */
public class P0333 {

    public static void main(String[] args) {

        for (int i = 0, j = 0; (i < 10) || (j < 15); i++, j += 2) {

            System.out.println("varijabla i: " + i);
            System.out.println("varijabla j: " + j);
        }
    }
}