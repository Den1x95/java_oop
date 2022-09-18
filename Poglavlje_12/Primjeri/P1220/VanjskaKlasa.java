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
package Poglavlje12.Primjeri.P1220;

/**
 * Vanjska klasa
 */
public class VanjskaKlasa {

    private String member = "neki string";

    public String getAtrVanjskeKlase() {

        final int var = 2;

        /**
         * Unutarnja klasa imenovana u metodi, mora biti deklarirana
         * prije korištenja.
         */
        class UnutarnjaKlasaMetode {

            int doubleVar = var * 2;
            String most = member;
        }

        UnutarnjaKlasaMetode u = new UnutarnjaKlasaMetode();
        return u.most;

    }

    /**
     * Staticka unutarnja klasa se smatra top level klasom.
     */
    static class StaticUnutarnjaKlasa {

        static final int MEMBER = 23;
    }

}
