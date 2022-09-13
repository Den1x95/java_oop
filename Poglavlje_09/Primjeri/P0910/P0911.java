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
package Poglavlje09.Primjeri.P0910;

import Poglavlje09.Primjeri.p0910.klase.Asistent;
import Poglavlje09.Primjeri.p0910.klase.Profesor;
import Poglavlje09.Primjeri.p0910.klase.Student;

/**
 * Primjer P0911
 * Nasljeđivanje klasa
 */
public class P0911 {

    public static void main(String[] args) {

        Student st = new Student();
        Asistent as = new Asistent();
        Profesor pf = new Profesor();

        st.setIme("Charlie Sheen");
        as.setIme("Bruce Lee");
        pf.setIme("Chuck Norris");

        System.out.println(st.statusStudenta());
        System.out.println("Ime: " + st.getIme());
        
        System.out.println(as.statusStudenta());
        System.out.println("Ime: " + as.getIme());

        System.out.println(pf.statusProfesora());
        System.out.println("Ime: " + pf.getIme());

    }
}
