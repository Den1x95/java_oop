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
 * Primjer P1222
 * Instanciranje objekta unutarnje klase mora biti napravljano preko objekta
 * vanjske klase dok referenciranje radimo preko imena vanjske klase.
 */
public class P1222 {

    public static void main(String[] args) {

        Parovi p = new Parovi(10);
        Parovi p2 = new Parovi(10);
        Parovi.Par pr = p2.new Par(1322, "cetvrti");
        System.out.print(pr);

        pr.setIme("peti");
        System.out.println(pr);

    }
}
