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
package Poglavlje15.Primjeri.p1520;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Primjer P1522 
 * Pisanje teksta u datoteku koristimo autoflush
 */
public class P1522 {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(
                new FileOutputStream(new File("C:\\Users\\Tomislav\\Desktop\\tekst2.txt")), true)) {

            pw.println("prva linija teksta novog.");
            pw.println("druga linija teksta.");
        } catch (IOException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
