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
 * P0332 Usporedba for i while petlje.
 */
public class P0332 {

    public static void main(String[] args) {

        int i = 0;
        int n = 5;

        for (; i < n;) { // while(i < 5){
            System.out.println("Prolazak br: " + i);
            i++;
        }

    }
}