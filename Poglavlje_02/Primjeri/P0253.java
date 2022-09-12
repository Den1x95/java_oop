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
 * P0253
 * Primjer operatora uspoređivanja
 */
public class P0253 {

    public static void main(String[] args) {
        int x = 10;

        boolean veciOdDeset = (x > 10);
        boolean manjiOdSto = (x < 100);

        System.out.println(" x je veci od 10 = " + veciOdDeset);
        System.out.println(" x je manji od 100 = " + manjiOdSto);

    }
}