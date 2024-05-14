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
 * P0252
 * Primjer logičkih operatora
 */
public class P0252 {

    public static void main(String[] args) {

        int a = 30;

        boolean veciOdDeset = (a > 10);
        boolean manjiOdSto = (a < 100);

        System.out.println("\"x je veci od 10 i manji od 100\" = "
                + (veciOdDeset & manjiOdSto));

    }
}