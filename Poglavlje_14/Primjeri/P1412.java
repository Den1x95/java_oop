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
package Poglavlje14.Primjeri;

/**
 * Primjer P1412
 * Pokretanje dretvi
 */
public class P1412 {

    public static void main(String[] args) {

        new MyRunner02().run();

        System.out.println("Gotova main metoda !");

    }
}

class MyRunner02 implements Runnable {

    public void run() {

        int i = 0;
        while(i < 10) {
            System.out.println("Pozdrav broj " + (i++));
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
