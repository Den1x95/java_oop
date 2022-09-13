/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.P0940.klase;

public class Pas extends Zivotinja {

    /* P0943 */
    @Override
    public String govori() {
        return "Vau";
    }

    /* P0944 */
    public int koeficijentBaljenja() {
        return 32;
    }

    /* P0945 i P0946 */
    public String naziv = "Ja sam u klasi Pas";
}
