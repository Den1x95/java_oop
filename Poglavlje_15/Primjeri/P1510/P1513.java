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
package Poglavlje15.Primjeri.P1510;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Primjer P1513 
 * Čitanje i pisanje sa BufferedWriter i BufferedReader objektima
 */
class P1513 {

    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter(new File("C:\\Users\\Vedran\\Desktop\\test2.txt")))) {

            bw.write("neki string");
            bw.flush();
        }

        try (BufferedReader br = new BufferedReader(
                        new FileReader(new File("C:\\Users\\Vedran\\Desktop\\test2.txt")))) {

            String line = br.readLine();
            System.out.println(line);
            
        }

    }
}
