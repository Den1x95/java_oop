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

import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer P1536 
 * Serializacija, citanje objekta iz datoteke
 */
class P1536 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Tomislav\\Desktop\\kontakt.ble");
        Kontakt knt1 = null;
        Kontakt knt2 = null;
        
        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream(f))) {

            knt1 = (Kontakt) os.readObject();
            knt2 = (Kontakt) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println("Prvi:\n" + knt1);
        System.out.println("Drugi:\n" + knt2);

        System.out.println("Home adresa je ista:" 
                + (knt1.getKuca() == knt2.getKuca()));
        System.out.println("Work adresa je ista:" 
                + (knt1.getPosao() == knt2.getPosao()));

    }
}
