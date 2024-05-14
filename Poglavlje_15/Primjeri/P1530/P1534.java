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
package Poglavlje15.Primjeri.p1530;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer P1534
 * Serializacija, citanje objekta iz datoteke
 */
class P1534 {

    public static void main(String[] args) throws IOException {

        Kontakt knt = null;

        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream("C:\\Users\\Tomislav\\Desktop\\kontakt.ble"))) {

            knt = (Kontakt) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println(knt);

    }
}
