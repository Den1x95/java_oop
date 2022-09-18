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
 * Primjer unutarnje klase Par i vanjeske klase Parovi.
 */
public class Parovi {

    /**
     * Klasa Par je unutarnja klasa klasi Parovi. Unutanje klase mogu imati
     * deklarirene sve modifikatore kao i atributi klasa.
     */
    protected class Par {

        private int godina;
        private String ime;

        public Par(int god, String ime) {
            this.godina = god;
            this.ime = ime;
        }

        public int getGodina() {
            return godina;
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        @Override
        public String toString() {
            return String.format("[Par: %d, %s], zauzeto %d mjesta \n",
                    godina, ime, freeField);
        }
    }

    private Par[] parovi;
    private int freeField = 0;

    public Parovi(int len) {
        parovi = new Par[len];
    }

    public void add(int god, String ime) {
        if(freeField < parovi.length) {
            parovi[freeField++] = new Par(god, ime);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < parovi.length; i++) {
            if(parovi[i] != null) {
                s += parovi[i];
            }
        }
        return s;
    }
}
