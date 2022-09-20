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
package Poglavlje15.Primjeri.P1530;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer P1538
 * Serializacija, citanje objekta iz datoteke, transient
 */
class P1538 {

    public static void main(String[] args) throws IOException {

        KontaktParanoid knt = null;
        File f = new File("C:\\Users\\Vedran\\Desktop\\kontakt.ble");
        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream(f))) {

            knt = (KontaktParanoid) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println(knt);

    }
}
