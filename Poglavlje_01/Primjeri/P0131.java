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

/**
 * P0131
 * Primjer izgleda i pravila organizacije datoteke sa Java izvornim kodom
 * sukladno Java Code Conventions. Navedeno u zagradama i jednolinijskim
 * komentarima je objašnjenje pravila za liniju ispod.
 *
 * @author Ime Prezime
 *
 * JavaDoc komentar objašnjava što program ili klasa rade. Obavezno se mora
 * navesti u svakom programu i sadrži ime autora, objašnjenje ulaznih
 * parametara, objašnjenje funkcionalnosti programa i sve ostalo što se
 * ne može iščitati direktno iz koda.
 *
 */
public class P0131 { // Pazi: ime programa počinje velikim slovom

    /**
     * Svaka metoda ima svoje objašnjenje i dokumentaciju koja se piše
     * u JavaDoc komentaru točno iznad metode. Mi koristimo samo jednu
     * metodu te nije potrebno ponavljati već napisano u komentaru
     * programa ili klase. No nužno je naglasiti kako je ovaj komentar
     * obavezan u većim programima i kako se mora uključiti u kod.
     *
     * Ovaj komentar se započinje u istom stupcu kao i metoda.
     * Metoda MORA BITI uvućena od deklaracije programa TOČNO 4 razmaka
     *
     * @param args
     */
    public static void main(String[] args) {
        // naredbe MORAJU biti uvučene TOČNO 8 razmaka od početka
		// što znači 4 razmaka od linije početka metode (public)
        
        System.out.println("Hello world!!!");
    }
}
