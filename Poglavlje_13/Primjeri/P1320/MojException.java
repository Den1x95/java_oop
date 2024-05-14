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
package Poglavlje13.Primjeri.P1320;

/**
 * Svaka klasa iznimki koja naslijeđuje Exception a ne RuntimeException
 * je checked exception.
 */
public class MojException extends Exception {

    public MojException() {
        super();
    }

    public MojException(String msg) {
        super(msg);
    }
}
