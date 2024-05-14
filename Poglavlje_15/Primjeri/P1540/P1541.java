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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer P1541 
 * Serializacija, pisanje objekta u datoteku
 */
class P1541 {

    public static void main(String[] args) throws IOException {

        KontaktGrupa knt = new KontaktGrupa();
        knt.setGrupa(2);

        try (FileOutputStream fs = new FileOutputStream("C:\\Users\\Vedran\\Desktop\\kontaktGrupa.ble");
                ObjectOutputStream os = new ObjectOutputStream(fs)) {

            os.writeObject(knt);
        }

        System.out.println(knt);

    }
}
