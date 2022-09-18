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
package Poglavlje13.Primjeri.P1320;

/**
 * Primjer P1321
 * Primjer kreiranja i bacanaj iznimke. Iznimka je objekt. Iznimku koju
 * moramo uhvatiti (catched exception) možemo obraditi na dva načina:
 * - Iznimka se hvata koristeći try/catch/finally blokove
 * - Iznimka se proslijeđuje dalje u stogu
 */
class P1321 {

    public static void main(String[] args) {

        try {
            new p1321().metodaBacaIznimku();
        }
        catch(MojException ex) {
            System.err.println("Dogodila se iznimka !");
            System.err.println("Klasa iznimke: " + ex.getClass().toString());
            System.err.println("Poruka iznimke: " + ex.getMessage());
        }

    }

    /**
     * U ovoj metodi dolazi do bacanja iznimke. Ova metoda ne obrađuje
     * iznimku već ju proslijeđuje dalje.
     *
     * Slučaj u kojem postoji mogućnost da se dogodi iznimka mora biti
     * detaljno opisana.
     *
     * @throws MojException opis slučaja kada se događa iznimka.
     */
    public void metodaBacaIznimku() throws MojException {

        MojException ex = new MojException("Poruka iznimke");
        throw ex;

    }
}
