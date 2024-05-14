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
 * Tijelo enum klase sadržava enum konstante. Enum konstante su popis
 * vrijednosti kojima se ne deklariraju niti tip niti modifikator.
 * Enum konstante su tipa klase unutar koje su navedeni i definiraju
 * reference na instance klase. Enum klasa nema drugih instanci osim onih
 * definiranih enum konstantama.
 */
public enum Boja {

    /* popis enum konstanti za klasu Boja */
    CRVENA, ZELENA, ZUTA, PLAVA;
    static int metoda(){ return 0;}
}
