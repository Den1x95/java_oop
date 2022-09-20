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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Jadnostavan TCP server program koji sluša na nekom portu. Prilikom svake
 * konekcije otvara se novi thread koji samo radi echo klijentovog unosa.
 *
 * Server prima i čalje stringove.
 *
 * Port se može postaviti preko argumenata komandne linije prilikom pokrejanja
 * programa: npr: pokretanje servera na portu 1234:
 *
 * java SimpleTCPServer 1234
 *
 */
public class SimpleTCPServer {

    public static void main(String[] args) {

        final int SOCKET_PORT;

        if (args.length > 0) {
            SOCKET_PORT = Integer.parseInt(args[0]);
        }
        else {
            SOCKET_PORT = 8898;
        }

        try {
            int i = 1;
            ServerSocket s = new ServerSocket(SOCKET_PORT);
            System.out.printf("Server started: %s, port %d, timeout %d\n",
                    InetAddress.getLocalHost(),
                    s.getLocalPort(),
                    s.getSoTimeout());

            while (true) {
                Socket incoming = s.accept();
                String name = String.format("konekcija %d", i);
                System.out.printf("Otvorena %s\n", name);
                Runnable r = new ThreadedEchoHandler(incoming, name);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        }
        catch (IOException e) {
            System.err.println("Socket greska: " + e);
        }

    }
}
