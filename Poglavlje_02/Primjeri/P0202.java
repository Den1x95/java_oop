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
 * P0202
 * Čitanje sa konzole pomoću readLine naredbe
 * Napomena: OBAVEZNO pokrenuti iz command prompta
 */
public class P0202 {

    public static void main(String[] args) {

        String niz = System.console().readLine("Unesite niz: ");
        System.out.println("Uneseni niz je: " + niz);

        int in = Integer.parseInt(niz);
        double db = Double.parseDouble(niz);
        boolean boo = Boolean.parseBoolean(niz);

        System.out.printf(" Integer: %d \n Double: %.2f \n Boolean: %b \n ", in, db, boo);

    }
}