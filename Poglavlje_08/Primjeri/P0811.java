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

import java.util.Arrays;


/**
 * P0811
 * Deklaracija klase i atributa. Rezultat deklariranja i inicijaliziranja
 * instance klase je kreiranje objekta. Dva različita objekta imaju različita
 * stanja i neovisni su jedan od drugog.
 */
class P0811 {

    public static void main(String[] args) {

        Klasa11 objekt1 = new Klasa11();
        Klasa11 objekt2 = new Klasa11();

        System.out.println("Objekt1 : " + objekt1.atributBroj);
        System.out.println("Objekt2 : " + objekt2.atributBroj);

        objekt1.atributBroj = 3;
        objekt2.atributBroj = 7;

        System.out.println("Objekt1 : " + objekt1.atributBroj);
        System.out.println("Objekt2 : " + objekt2.atributBroj);

        objekt1.atributIme = "Marko";
        objekt1.atributPolje[1] = 'e';

        System.out.println("Objekt1 ime: " + objekt1.atributIme);
        System.out.println("Objekt1 polje: " + Arrays.toString(objekt1.atributPolje));

    }
}

class Klasa11 {

    String atributIme = "Ivan";
    int atributBroj = 2;
    char[] atributPolje = new char[]{'a', 'b', 'c'};
}
