/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe4;

import javax.swing.JButton;

/**
 *
 * @author Jure
 */
public class Start {

    public static void main(String[] args) {
        Zaposlenik zaposlenik = new Zaposlenik();
        

        zaposlenik.setIme("Tomislava");
        zaposlenik.setPrezime("Žilić");
        zaposlenik.setVisina(177);
        zaposlenik.setStudent(true);
        System.out.println(zaposlenik);

        System.out.println(zaposlenik.getIme());

        zaposlenik = new Zaposlenik();
        zaposlenik.setIme("Jure");
        zaposlenik.setPrezime("Žilić");
        zaposlenik.setVisina(195);
        zaposlenik.setStudent(false);
        System.out.println(zaposlenik);

        System.out.println(zaposlenik.getIme());

        //ovdje dode nova instanca
        Automobil automobil = new Automobil();

        automobil.setNaziv("Mercedes");
        automobil.setKonji("puno konja");
        automobil.setBoja(060000);
        automobil.setBrz(true);
        System.out.println(automobil);

        System.out.println(automobil.getNaziv());

        //ova linija je zamjenila gore onih 5 zato sta je napraljen jos jedan konstruktor
        Osoba o = new Zaposlenik(0,"Jure", "Žilić", 195, false);
        System.out.println(o.getIme());

        Zupanija zupanija = new Zupanija();

        zupanija.setIme("Sisacko-moslavacka zupanija");
        zupanija.setPolozaj("središnja Hrvatska");
        zupanija.setVelika(true);
        System.out.println(zupanija);

        System.out.println(zupanija.getIme());

        zupanija.setIme("Licko-senjska zupanija");
        zupanija.setPolozaj("središnja Hrvatska");
        zupanija.setVelika(true);
        System.out.println(zupanija);

        System.out.println(zupanija.getIme());

        
        //zaposlenik
        
        Zaposlenik z = new Zaposlenik();
        z.setIme("Zvonimir");
        z.setPrezime("Žilić");
        z.setStudent(true);
        z.setVisina(198);
        System.out.println(z.getIme());
        
        
        z = new Zaposlenik(200,"Marija", "Žilić", 170, false);
        System.out.println(z.getIme());
        
        JButton b = new JButton ();
        
        
        
    }
}
