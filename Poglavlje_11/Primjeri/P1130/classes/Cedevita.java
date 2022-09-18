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
package Poglavlje11.Primjeri.P1130.classes;

import Poglavlje11.Primjeri.P1130.interfaces.Pitak;

public class Cedevita extends Hrana implements Pitak {

    public Cedevita() {
        super("Ceda", 56);
    }

    @Override
    public String kakoKonzumirati() {
        return "just drink it";
    }

    @Override
    public String kakoPripremiti() {
        return "one tablespoon in one glass of water";
    }
}
