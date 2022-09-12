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
 * P0444
 * Primjer preopterecenja metoda, potpis metode, greske.
 */
class P0444 {

    public static void main(String[] args) {

        int i = 5;
        long l = 10;

        // greska, pozivamo metodu kojoj je povratna vrijednost tipa long, z1 je int
        //int z1 = metodaZbroji(i, l);
    }

    static int metodaZbroji(int a, int b) {
        return a + b;
    }

    // gre�ka, povratni tip nije u potpisu metode, vec imamo metodu s ovim potpisom
    /*
    static long metodaZbroji(int c, int d) {
        return c + d;
    }

    static long metodaOverload(int a, long b) {
        return a + b;
    }*/
}
