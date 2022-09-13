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
package Poglavlje09.Primjeri.p0940;

import Poglavlje09.Primjeri.p0940.klase.Hrcak;
import Poglavlje09.Primjeri.p0940.klase.Macka;
import Poglavlje09.Primjeri.p0940.klase.Riba;
import Poglavlje09.Primjeri.p0940.klase.Zivotinja;
import Poglavlje09.Primjeri.p0940.klase.Pas;

/**
 * Primjer P0946
 * Problem skrivanja atributa, ručnim castom dolazimo do atributa klase
 * instance.
 */
public class P0946 {

    public static void main(String[] args) {

        Zivotinja[] zoo = {
            new Pas().setZivotinja("Rex", "Pas"),
            new Macka().setZivotinja("Tula", "Macka"),
            new Hrcak().setZivotinja("Fifi", "Hrcak"),
            new Riba().setZivotinja("Blub", "Riba")
        };

        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] instanceof Pas) {
                System.out.println(((Pas) zoo[i]).naziv);
            }
            if (zoo[i] instanceof Macka) {
                System.out.println(((Macka) zoo[i]).naziv);
            }
            if (zoo[i] instanceof Hrcak) {
                System.out.println(((Hrcak) zoo[i]).naziv);
            }
            if (zoo[i] instanceof Riba) {
                System.out.println(((Riba) zoo[i]).naziv);
            }
        }

    }
}
