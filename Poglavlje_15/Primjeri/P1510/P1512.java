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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Primjer P1512 
 * Try with resources blok moguće je implementirati nad objektima koji
 * implementiraju Closeable i AutoCloseable sučelja.
 */
class P1512 {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter(new File("C:\\Users\\Tomislav\\Desktop\\test1.txt"))) {
            fw.write("Hello world, ja sam u datoteci!");
            fw.flush();
        } catch (IOException ex) {
            System.err.println(ex);
        }

        try (FileReader fr = new FileReader(new File("C:\\Users\\Tomislav\\Desktop\\test1.txt"))) {
            char[] chr = new char[25];
            fr.read(chr);
            for (char c : chr) {
                System.out.print(c);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
