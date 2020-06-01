/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Jure
 */
public class Strukture {
    
    public void lista() {
        
        System.out.println("Primjer rada s listama");
        List<Osoba> listaOsoba = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            listaOsoba.add(ucitajOsobu());
        }
        
        //5. vrsta iteracija
        listaOsoba.forEach(o->System.out.println(o.getVisina()));
        
    }
    
    private Osoba ucitajOsobu() {
        Osoba osoba = new Osoba();
        osoba.setIme(JOptionPane.showInputDialog("Upiši ime"));
        osoba.setPrezime(JOptionPane.showInputDialog("Upiši prezime"));
        osoba.setVisina(Pomocno.ucitajBroj("Upiši visinu"));
        osoba.setMjesto(new Mjesto());
        osoba.getMjesto().setNaziv("Osijek");
        return osoba;
    }
}
