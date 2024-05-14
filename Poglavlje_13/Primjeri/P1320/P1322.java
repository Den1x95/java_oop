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
package Poglavlje13.Primjeri.P1320;

class P1322 extends P1321 {

    /**
     * Metoda može baciti i više iznimki.
     *
     * Metoda podklase koja overrida metodu koja baca iznimku mora baciti
     * iste iznimke koje su deklarirane u metodi nadklase ili može
     * izostaviti deklaraciju iznimki, ali nesmije baciti više iznimki
     * ili šire iznimke.
     *
     * @throws MojException opis uvjeta da se iznimka pojavi
     * @throws MojDrugiException opis uvjeta da se iznimka pojavi
     */
    public void drugaMetoda() throws MojException, MojDrugiException {

        metodaBacaIznimku();
        throw new MojDrugiException();

    }

    @Override
    public void metodaBacaIznimku() throws MojDrugiException{
        
    }

}
