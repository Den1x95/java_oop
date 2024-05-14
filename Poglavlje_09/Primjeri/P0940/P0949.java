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

package Poglavlje09.Primjeri.P0940;

/**
 * Program ...
 */
public class P0949 {
    public static void main(String[] args) {
        
        KlasaA oaa = new KlasaA();
        KlasaA oab = new KlasaB();
        KlasaB obb = new KlasaB();
//        System.out.printf("o11: %d\no12: %d\no22: %d\n", oaa.a,oab.a, obb.a);
        System.out.printf("o11: %d\no12: %d\no22: %d\n", oaa.getA(),oab.getA(), obb.getA());
        //Klasa2 o22 = new Klasa1();
        
    }
}
class KlasaA {
    private int a = 5; //probaj staviti public - ista stvar

    public int getA() {
        return a;
    }
    
}

class KlasaB extends KlasaA{
    private int a = 6;

    public int getA() {
        return a;
    }
    
}
