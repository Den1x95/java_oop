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
package Poglavlje11.Primjeri.P1130.classes;

import Poglavlje11.Primjeri.P1130.interfaces.Cookable;
import Poglavlje11.Primjeri.P1130.interfaces.Jestiv;

public class Badem extends Hrana implements Jestiv, Cookable {

    public Badem() {
        super("Badem", 159);
    }

    @Override
    public String kakoKonzumirati() {
        return "Just eat the core.";
    }

    @Override
    public String kakoPripremiti() {
        return "Throw them on some cake.";
    }
}
