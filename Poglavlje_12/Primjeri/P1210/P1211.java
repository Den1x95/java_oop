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
package Poglavlje12.Primjeri.P1210;
        
/**
 * Primjer P1211
 * Primjer referenciranja Enum objekata
 */
public class P1211 {

    public static void main(String[] args) {

        /*
         * Adresa na objekt CRVENA klase Boja vec postoji.
         * Nalazi se u referenci Boja.CRVENA
         */
        Boja b = Boja.CRVENA;
        printStatus(b);       
        printStatus(Boja.ZELENA);

    }

    static void printStatus(Boja bo) {

        System.out.println("Referenca u bo je " + bo);

        System.out.println(
                "Referenca bo "
                + ((bo instanceof Boja) ? "je " : "nije ")
                + "klase Boja");

        System.out.println(
                "Referenca bo "
                + ((bo == Boja.CRVENA) ? "pokazuje " : "ne pokazuje ")
                + "na isti objekt kao i Boja.CRVENA");
    }
}
