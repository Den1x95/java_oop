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

import Poglavlje08.Primjeri.paket.Klasa31;
//import Poglavlje08.Primjeri.paket.podpaket.Klasa31;

/**
 * P0831
 * Grupe klasa, paketi.
 */
class P0831 {

    public static void main(String[] args) {

       Klasa31 obj1 = new Klasa31();
       Poglavlje08.Primjeri.paket.podpaket.Klasa31 obj2;
        obj2 = new Poglavlje08.Primjeri.paket.podpaket.Klasa31();

        //obj1.ime = "Marko";
        obj1.prezime = "Wong";
        //obj2.broj = 9;

    }
}
