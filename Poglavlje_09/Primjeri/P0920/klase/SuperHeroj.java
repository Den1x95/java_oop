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
package Poglavlje09.Primjeri.P0920.klase;

public class SuperHeroj {

    /* Primjer P0921 */
    public String mojProgram(){
        return "Ja sam Heroj ulice. ";
    }

    /* Primjer P0922 */
    private String ime = "Superheroj ";
    public final String getIme() {
        return ime;
    }

    /* Primjer P0923 */
    protected String prezime = "Suljo ";
    public String getPrezime() {
        return prezime;
    }

}
