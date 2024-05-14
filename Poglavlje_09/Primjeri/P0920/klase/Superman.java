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
package Poglavlje09.Primjeri.P0920.klase;

public class Superman extends SuperHeroj {

    /* Primjer p0921 */
    public String mojSuperProgram(){
        return "Ja sam Superman. "
                + "Volim letjeti i imam S na prsima. ";
    }

    /* Primjer p0922 */
    private String ime = "Superman ";
    public String getMojeIme(){
        return ime;
    }

    /* Primjer p0923 */
    protected String prezime = "Geek ";
    public String getPrezime() {
        return prezime;
    }

}
