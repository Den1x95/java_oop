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
package Poglavlje13.Primjeri.P1310;

/**
 * Primjer P1318
 * Primjer Error, Error možemo hvatati ali se od njega ne možemo 
 * oporaviti. Označava grešku prilikom rada virtualne mašine.
 */
public class P1318 {

    public static void main(String[] args) {

        try {
            int rek = rekurzija(1);
        } catch (Throwable t) {
            System.out.println(t);
        }
//        System.out.println("Uhvatio sam error: " + err.getMessage());

    }

    static int rekurzija(int broj) {
        return rekurzija(broj++);
    }
}
