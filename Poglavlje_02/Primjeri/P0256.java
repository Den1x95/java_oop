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
 * P0256
 * Primjer bitovnih operatora: *   >>, >>>, <<, &, |, ^, ~
 */
public class P0256 {

    public static void main(String[] args) {

        int registar = -1;

        System.out.println("Binarni prikaz broja " + registar
                + " izgleda ovako: " + Integer.toBinaryString(registar));

        System.out.println("Oktalni prikaz broja " + registar
                + " izgleda ovako: " + Integer.toOctalString(registar));

        System.out.println("Heksadacimalni prikaz broja " + registar
                + " izgleda ovako: " + Integer.toHexString(registar));

        System.out.print("Bitovni pomak u desno  (registar >> 1) = " + (registar >> 1));
        System.out.println(" " + Integer.toHexString(registar >> 1));

        System.out.print("Bitovni pomak u lijevo (registar << 1) = " + (registar << 1));
        System.out.println(" " + Integer.toHexString(registar << 1));

        System.out.print("Bitovni pomak u desno bez predznaka (registar >>> 1) = " + (registar >>> 1));
        System.out.println(" " + Integer.toHexString(registar >>> 1));

        System.out.print("Jedinicni komplement (~registar) = " + (~registar));
        System.out.println(" " + Integer.toHexString(~registar));

    }
}