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

import Poglavlje11.Primjeri.P1130.interfaces.Pitak;

public class Jabuka extends Hrana implements Pitak {

    public Jabuka() {
        super("Jabuka", 32);
    }

    @Override
    public String kakoKonzumirati() {
        return "Eat it raw or drink the juice out of it.";
    }

    @Override
    public String kakoPripremiti() {
        return "Wash it, slice it, smash it, sqeeze the juice ut of it, drink it. "
                + "Or just buy apple juice.";
    }
}
