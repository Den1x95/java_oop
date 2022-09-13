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
package Poglavlje09.Primjeri.P0940;

import Poglavlje09.Primjeri.p0940.klase.Hrcak;
import Poglavlje09.Primjeri.p0940.klase.Macka;
import Poglavlje09.Primjeri.p0940.klase.Riba;
import Poglavlje09.Primjeri.p0940.klase.Zivotinja;
import Poglavlje09.Primjeri.p0940.klase.Pas;

/**
 * Primjer P0942
 * Objekte različitih klasa možemo grupirati po njihovim zajedničkim svojstvima.
 * Klase imaju zajednička svojstva kada naslijeđuju istu klasu.
 */
public class P0942 {

    public static void main(String[] args) {

        Zivotinja[] zoo = {
            new Pas().setZivotinja("Rex", "Pas"),
            new Macka().setZivotinja("Tula", "Macka"),
            new Hrcak().setZivotinja("Fifi", "Hrcak"),
            new Riba().setZivotinja("Blub", "Riba")
        };

        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i] + ", Klasa: "
                    + zoo[i].getClass().getSimpleName());
        }

    }
}
