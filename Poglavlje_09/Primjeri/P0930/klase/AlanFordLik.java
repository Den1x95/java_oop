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

public class AlanFordLik {

    private String ime;
    private String grupa;

    public void setImeGrupa(String ime, String grupa) {
        this.ime = ime;
        this.grupa = grupa;
    }

    public String getGrupa() {
        return grupa;
    }

    public String getIme() {
        return ime;
    }

}
