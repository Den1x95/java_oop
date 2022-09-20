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
package Poglavlje15.Primjeri.P1520;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Primjer P1523 
 * Čitanje tekstualne datoteke
 */
public class P1523 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new FileReader(
                    new File("C:\\Users\\Tomislav\\Desktop\\tekst2.txt")));
            while (sc.hasNext()) {
                System.out.print(sc.nextLine() + "\n");
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
