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
package Poglavlje09.Primjeri.P0930.klase;

public class AlanFordLikKojiGovori extends AlanFordLik{

    @Override
    public String toString() {        
        return String.format("%s, %s", super.getIme(), super.getGrupa());
    }

}
