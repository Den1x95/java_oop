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
 * P0611
 * Primjer usporedjivanja stringova
 */
public class P0611 {

    public static void main(String[] args) {
        
        // kreiranje string objekata preko literala - stavljanje u literal pool.
        String s1 = "ja sam mali string";
        String s2 = "ja sam mali string";
        
        // pozivanje konstruktora koji prima string.
        String s3 = new String("ja sam mali string");  
        // pozivanje konstruktora bez parametara.
        String s4 = new String();
        s4 = "ja sam mali string";

        System.out.println("s1, s2 su jednaki (==) ? " + (s1 == s2));
        System.out.println("s1, s2 su jednaki (equals) ? " + (s1.equals(s2)));

        System.out.println("s1, s3 su jednaki (==) ? " + (s1 == s3));
        System.out.println("s1, s3 su jednaki (equals) ? " + (s1.equals(s3)));

        System.out.println("s1, s4 su jednaki (==) ? " + (s1 == s4));
        System.out.println("s1, s4 su jednaki (equals) ? " + (s1.equals(s4)));

    }
}
