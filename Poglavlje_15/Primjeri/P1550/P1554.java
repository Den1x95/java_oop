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
package Poglavlje15.Primjeri.P1550;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Rad sa URL-om
 */
public class P1554 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.vedrannovak.com");
            URLConnection conn = url.openConnection();
            conn.connect();

            Scanner in = new Scanner(conn.getInputStream());
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);

            }
            in.close();
        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
