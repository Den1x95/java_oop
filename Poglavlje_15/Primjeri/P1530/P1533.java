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

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer P1533
 * Serializacija, pisanje objekta u datoteku
 */
class P1533 {

    public static void main(String[] args) throws IOException {

        Kontakt knt = new Kontakt(
                new Adresa("Slovenska", "Zagreb"),
                new Adresa("Konavoska", "Zagreb"));
        System.out.println(knt);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream("C:\\Users\\Tomislav\\Desktop\\kontakt.ble"))) {

            os.writeObject(knt);
        }

    }
}
