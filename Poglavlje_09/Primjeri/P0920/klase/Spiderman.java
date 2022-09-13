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

public class Spiderman extends SuperHeroj {

    /* Primjer P0921 */
    public String mojProgram(){
        return
                super.mojProgram() +
                "Ja sam Spiderman. "
                + "Superman je mala beba za mene. "
                + "Ja se volim verati po zgradama. ";
    }

    /* Primjer P0922 */
    private String ime = "Spiderman ";
    public String getMojeIme(){
        return ime;
    }

    /* Primjer P0923 */
    protected String prezime = "VanillaIce ";
    public String getPrezime() {
        return prezime;
    }

}
