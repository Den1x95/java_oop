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
package Poglavlje09.Primjeri.P0940.klase;

public class Zivotinja {

    private String rod;
    private String ime;

    /* P0941 */
    @Override
    public String toString() {
        return rod + " " + ime;
    }

    /* P0941 i P0942 */
    public Zivotinja setZivotinja(String novoIme, String novoRod) {
        ime = novoIme;
        rod = novoRod;
        return this;
    }

    /* P0943 */
    public String govori() {
        return "Ja sam mutava životinja";
    }

    /* P0945 i P0946 */
    public String naziv = "Ja sam Zivotinja u klasi Zivotinja";


//    public String getIme() {
//        return ime;
//    }

//    public String getRod() {
//        return rod;
//    }
//

}
