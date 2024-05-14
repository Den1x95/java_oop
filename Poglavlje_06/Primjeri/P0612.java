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
 * P0612
 * Primjer usporedjivanja stringova.
 */
public class P0612 {

    public static void main(String[] args) {

        // kreiranje string objekata preko literala - stavljanje u literal pool.
        String s1 = "ja sam mali string";

        // pozivanje konstruktora koji prima string. Vratiti će objekt izvan poola.
        String s2 = new String("ja sam mali string");


        System.out.println("s1, s2 su jednaki (==) ? " + (s1 == s2));
        System.out.println("s1, s2 su jednaki (equals) ? " + (s1.equals(s2)));

        s2 = s2.intern();
        System.out.println("s1, s2 su jednaki po onome što vraća metoda intern() (==) ? " + (s1 == s2));

    }
}
