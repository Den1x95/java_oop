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
package Poglavlje11.Primjeri.P1130.interfaces;

/**
 * Ovo sučelje implementiraju klase čiji objekti imaju svojstvo da ih se može
 * jesti. Jestivi objekti moraju implementirai metodu kakoKonzumirati koja vraća opis
 * kako se takav objekt konzumira.
 */
public interface Jestiv {

    /**
     * Metoda koja vraća opis načina kako se konzumira.
     * @return opis načina kako se konzumira.
     */
    String kakoKonzumirati();

}
