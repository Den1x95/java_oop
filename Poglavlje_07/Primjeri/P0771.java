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

import java.util.ArrayList;
import java.util.Date;

/**
 * P0771
 * Klasa ArrayList i instanciranje kolekcije ArrayList.
 */
class P0771 {

    public static void main(String[] args) {

        ArrayList mojaLista = new ArrayList();//primjetimo da nismo definirali veličinu!
        mojaLista.add(4);
        mojaLista.add("sd");
        
        for (Object e : mojaLista) {
            System.out.println(e);
        }
        
        // Nakon jave 5 možemo mu reći koji će elementi biti unutra.
        
        ArrayList<Integer> mojaSigurnaLista = new ArrayList<>();
        Short a = 3;
        mojaSigurnaLista.add((int)a);
        // Date dt = new Date();
        // Date[] poljeDate = {dt, new Date(), null};
        // Date[][] polje2Date = {poljeDate, {new Date(), new Date()}};
        
        mojaSigurnaLista.add(4);
        // mojaSigurnaLista.add("sd"); //greška        
        
    }
}
