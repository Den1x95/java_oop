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
package Poglavlje15.Primjeri.P1550;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class P1551 {

    private InputStream ins;

    public void sayHi() {

        SocketAddress sca = new InetSocketAddress("localhost", 8898);
        try (Socket sc = new Socket()) {
            sc.setSoTimeout(5000);
            sc.connect(sca);

            ins = sc.getInputStream();
            Scanner s = new Scanner(ins);

            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        }
        catch (SocketException ex) {
        }
        catch (IOException ex) {
        }
    }

    public static void main(String[] args) {

        new P1551().sayHi();

    }
}
