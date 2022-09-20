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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class P1552 {

    private Socket sc;
    private InputStream ins;
    private OutputStream ous;

    public void sayHi() throws  IOException {

        try {
            sc = new Socket("192.168.1.28", 8898);
            ins = sc.getInputStream();
            ous = sc.getOutputStream();

            new Thread(new Runnable() {

                public void run() {
                    Scanner s = new Scanner(ins);
                    while (s.hasNextLine()) {
                        System.out.println(s.nextLine());
                    }
                }
            }).start();

            PrintWriter pw = new PrintWriter(ous);
            Scanner konzola = new Scanner(System.in);
            String naredba;
            do {
                naredba = konzola.nextLine();
                pw.println(naredba);
                pw.flush();
            }
            while (!naredba.equals("BYE"));

        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        try {
            new P1552().sayHi();
        } catch (UnknownHostException ex) {
        } catch (IOException ex) {
        }

    }
}
