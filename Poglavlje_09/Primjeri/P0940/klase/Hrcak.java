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
package Poglavlje09.Primjeri.P0940.klase;

public class Hrcak extends Zivotinja {

    /* P0943 */
    @Override
    public String govori() {
        return "Squeek";
    }

    /* P0944 */
    public int prosjecniBrojDanaHibernacije() {
        return 69;
    }

    /* P0945 i P0946 */
    public String naziv = "Ja sam u klasi Hrcak";
}
