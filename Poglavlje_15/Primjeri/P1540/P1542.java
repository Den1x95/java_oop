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
package Poglavlje15.Primjeri.P1540;

import Poglavlje15.Primjeri.P1530.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer P1542 
 * Serializacija, citanje objekta iz datoteke, transient
 */
class P1542 {

    public static void main(String[] args) throws IOException {

        KontaktGrupa knt = new KontaktGrupa();

        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream("C:\\Users\\Tomislav\\Desktop\\kontaktGrupa.ble"))) {

            knt = (KontaktGrupa) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println(knt);

    }
}
