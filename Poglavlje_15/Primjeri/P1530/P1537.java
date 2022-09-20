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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer P1537
 * Serializacija, pisanje objekta u datoteku.
 */
class P1537 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Vedran\\Desktop\\kontakt.ble");
        KontaktParanoid knt = new KontaktParanoid(
                new Adresa("Slovenska", "Zagreb"),
                new Adresa("Konavoska", "Zagreb"),
                new Adresa("Srednjaci", "Zagreb"));
        System.out.println(knt);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream(f))) {

            os.writeObject(knt);
        }

    }
}
