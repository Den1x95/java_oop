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
package Poglavlje15.Primjeri.P1550.TCPServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class ThreadedEchoHandler implements Runnable {

    private Socket incoming;
    private String name;

    public ThreadedEchoHandler(Socket i, String connName) {
        incoming = i;
        name = connName;
    }

    @Override
    public void run() {

        try {
            try {
                Scanner in = new Scanner(incoming.getInputStream());
                PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);

                out.printf("Pozdravljeni! Spojeni ste na  %s, port %d, %s\n",
                        InetAddress.getLocalHost(),
                        incoming.getLocalPort(),
                        name);
                out.println("Unesite BYE za kraj.");

                // echo client input
                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    System.out.printf("%s: %s\n", name, line);
                    out.printf("Echo: %s\n", line);
                    if (line.trim().equals("BYE")) {
                        done = true;
                    }
                }
            }
            finally {
                incoming.close();
                System.out.printf("%s closed.\n", name);
            }
        }
        catch (IOException e) {
            System.err.printf("%s greska: %s ", name, e);
        }

    }
}
