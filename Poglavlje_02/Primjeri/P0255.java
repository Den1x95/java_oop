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

/**
 * P0255
 * Primjer unarnih operatora, prefiks i postfiks
 */
public class P0255 {

    public static void main(String[] args) {

        int a = 5;
        int b = ++a;    // prvo povecavamo a pa tek onda dodjeljujemo vrijednost varijabli b
        int c = a++;    // prvo dodjeljujemo vrijednost varijabli c pa tek onda povecavamo a
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        double d = 5;
        double e = --d;    // prvo smanjujemo d pa tek onda dodjeljujemo vrijednost varijabli e
        double f = d--;    // prvo dodjeljujemo vrijednost varijabli f pa tek onda smanjujemo d
        System.out.println("d: " + d + ", e: " + e + ", f: " + f);

        char g = 'g';
        char h = g++;
        char i = g--;
        System.out.println("g: " + g + ", h: " + h + ", i: " + i);

    }
}