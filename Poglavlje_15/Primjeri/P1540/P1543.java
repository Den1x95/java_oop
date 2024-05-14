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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperClass {

    int atr = 5;
}

class SubClass extends SuperClass implements Serializable {

    String ime;

    public SubClass(String i, int a) {
        this.ime = i;
        this.atr = a;
    }
}

/**
 * Primjer P1543 
 * Serijalizacija superklase i podklase
 */
class P1543 {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Tomislav\\Desktop\\NadKlasaPodKlasa.spe");
        SubClass sb = new SubClass("zovko", 7);
        System.out.println("prije: " + sb.ime + ", " + sb.atr);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream(f))) {

            os.writeObject(sb);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        try (ObjectInputStream is = new ObjectInputStream(
                        new FileInputStream(f))) {

            sb = (SubClass) is.readObject();
        } catch (Exception ex) {
            System.err.println(ex);
        }

        System.out.println("poslije: " + sb.ime + ", " + sb.atr);

    }
}
