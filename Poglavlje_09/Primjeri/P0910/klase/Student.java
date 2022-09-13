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
package Poglavlje09.Primjeri.P0910.klase;

public class Student extends Osoba {

    protected String zanimanje;

    public void setIme(String ime) {
        this.ime = ime;
        zanimanje = "Student";
    }

    public String statusStudenta() {
        return zanimanje + " " + ime;
    }
    
}
