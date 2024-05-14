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

import java.io.Serializable;

public class Adresa implements Serializable {

    private String adresa;
    private String grad;

    public Adresa(String adresa, String grad) {
        this.adresa = adresa;
        this.grad = grad;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", adresa, grad);
    }
}
