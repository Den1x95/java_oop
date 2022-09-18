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
package Poglavlje12.Primjeri.P1210;

/**
 * Enum klasa može imati deklarirane konstruktore, metode i overridane metode
 * klase Object.
 */
public enum Velicina {

    XXS("2xExtra small"),
    XS("Extra small"),
    S("Small"),
    M("Medium"),
    L("Large"),
    XL("Extra large"),
    XXL("2xExtra large");

    private String opis;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String s) {
        opis = s;
    }

    Velicina(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return getOpis();
    }
};
