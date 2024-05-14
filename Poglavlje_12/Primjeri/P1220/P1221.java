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
package Poglavlje12.Primjeri.P1220;

/**
 * Primjer P1221
 * Korištenje unutarnje klase.
 */
public class P1221 {

    public static void main(String[] args){

        Parovi p = new Parovi(10);
        p.add(1021, "prvi");
        p.add(1357, "drugi");
        p.add(1421, "treci");
        System.out.println(p);

    }

}
