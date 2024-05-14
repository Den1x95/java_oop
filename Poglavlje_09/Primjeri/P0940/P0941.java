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
package Poglavlje09.Primjeri.P0940;

import Poglavlje09.Primjeri.p0940.klase.Hrcak;
import Poglavlje09.Primjeri.p0940.klase.Macka;
import Poglavlje09.Primjeri.p0940.klase.Pas;
import Poglavlje09.Primjeri.p0940.klase.Riba;
import Poglavlje09.Primjeri.p0940.klase.Zivotinja;


/**
 * Primjer P0941
 * Primjer polimorfizna klasa. Klase Pas, Macka, Riba i Hrcak naslijeđuju
 * klasu Zivotinja te možemo instance (objekte) navedenih klasa promatrati
 * kao objekte klase Zivotinja.
 */
public class P0941 {

    public static void main(String[] args) {

        Zivotinja z1 = new Pas();
        z1.setZivotinja("Rex", "Pas");

        Zivotinja z2 = new Macka();
        z2.setZivotinja("Tula", "Macka");

        Zivotinja z3 = new Hrcak();
        z3.setZivotinja("Fifi", "Hrcak");

        Zivotinja z4 = new Riba();
        z4.setZivotinja("Blub", "Riba");

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);


    }
}
