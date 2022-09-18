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
 * Primjer P1223
 * Unutarnja klasa deklarirana u metodi.
 */
public class P1223 {

    public static void main(String[] args) {

        VanjskaKlasa k = new VanjskaKlasa();
        System.out.println(k.getAtrVanjskeKlase());
        
        VanjskaKlasa.StaticUnutarnjaKlasa kl = 
                new VanjskaKlasa.StaticUnutarnjaKlasa();

    }
}
