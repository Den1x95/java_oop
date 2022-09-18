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
 * Primjer P1411
 * Objekt koji implementira Runnable sučelje i run metodu.
 */
public class P1411 {

    public static void main(String[] args) {

        MyRunner01 rn = new MyRunner01();
        rn.run();

        Thread th = new Thread(rn);
        th.start();

    }
}

class MyRunner01 implements Runnable {

    @Override
    public void run() {
        System.out.println("Pozdrav !");
    }
}
