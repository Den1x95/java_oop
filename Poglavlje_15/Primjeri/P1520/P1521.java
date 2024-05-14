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
package Poglavlje15.Primjeri.P1520;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Primjer P1521 
 * Pisanje teksta u datoteku
 */
public class P1521 {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(
                        new FileWriter(new File("C:\\Users\\Vedran\\Desktop\\tekst.txt")))) {

            pw.println("prva linija teksta.");
            pw.println("druga linija teksta.");
            pw.flush();
        } catch (IOException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
