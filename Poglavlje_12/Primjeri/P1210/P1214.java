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
package Poglavlje12.Primjeri.P1210;

/**
 * Primjer P1214
 * Primjer metoda i konstruktora enum klase
 */
public class P1214 {

    public static void main(String[] args) {

        System.out.println(Velicina.XS.getOpis());
        
        System.out.println("------------------------");
		
        for (Velicina v : Velicina.values()) {
            System.out.println(v);
        }
		
        System.out.println("------------------------");
        Velicina.XS.setOpis("Novi opis XS objekta");
        System.out.println(Velicina.XS.getOpis());
        
        System.out.println("------------------------");
		
        for (Velicina v : Velicina.values()) {
            System.out.println(v);
        }

    }
}
