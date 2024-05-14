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
package Poglavlje15.Primjeri.P1530;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer P1531
 * Serializacija, pisanje objekta u datoteku
 */
class P1531 {

    public static void main(String[] args) throws IOException {

        Adresa adr = new Adresa("Konavoska", "Zagreb");
        System.out.println(adr);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream("C:\\Users\\Tomislav\\Desktop\\kontakt.ble"))) {

            os.writeObject(adr);
        }

    }
}