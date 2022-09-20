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
package Poglavlje15.Primjeri.p1530;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer P1532 
 * Serializacija, čitanje objekta iz datoteke
 */
class P1532 {

    public static void main(String[] args) throws IOException {

        Adresa adr = null;

        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream("C:\\Users\\Tomislav\\Desktop\\kontakt.ble"))) {

            adr = (Adresa) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println(adr);
    }
}
