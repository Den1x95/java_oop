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
package Poglavlje15.Primjeri.P1540;

import Poglavlje15.Primjeri.P1540.*;

class Grupa {

    private enum grupe {familija, biznis, frendovi, ostali};

    private grupe grupa = grupe.ostali;

    @Override
    public String toString() {
        return grupa.toString();
    }

    public void modify(int g){
        switch(g){
            case 0 : grupa = grupe.familija; break;
            case 1 : grupa = grupe.biznis; break;
            case 2 : grupa = grupe.frendovi; break;
            case 3 : grupa = grupe.ostali; break;
        }
    }

    public Grupa() {}

    public Grupa(int g){
        switch(g){
            case 0 : grupa = grupe.familija; break;
            case 1 : grupa = grupe.biznis; break;
            case 2 : grupa = grupe.frendovi; break;
            case 3 : grupa = grupe.ostali; break;
        }
    }

    public int getGrupa(){
        return grupa.ordinal();
    }

}
