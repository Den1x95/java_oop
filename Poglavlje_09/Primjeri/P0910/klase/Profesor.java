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
package Poglavlje09.Primjeri.P0910.klase;

public final class Profesor extends Osoba {

    private String zanimanje;

    public void setIme(String ime) {
        this.ime = ime;
        zanimanje = "Profesor";
    }

    public String statusProfesora() {
        return zanimanje + " " + ime;
    }
}
