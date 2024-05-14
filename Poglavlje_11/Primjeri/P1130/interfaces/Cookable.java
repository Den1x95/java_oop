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
 * kuhati, tj pripremiti za konzumiranje.
 */
public interface Cookable {

    /**
     * Metoda koja vraća opis načina kako se priprema.
     * @return opis načina kako se priprema.
     */
    String kakoPripremiti();
}
