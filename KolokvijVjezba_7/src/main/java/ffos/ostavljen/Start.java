/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package ffos.ostavljen;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
 
 

public class Start {

    private List<Ostavljen> ostavljeni;

    public Start() {
        
        JOptionPane.showMessageDialog(null, "Dobrodošli u program ostavljeni! V1");

        ostavljeni = new ArrayList<>();
        ucitajOstavljene();
        ispisiIndiferentnost();

    }

    public static void main(String[] args) {

        new Start();

    }


 
    private void ucitajOstavljene() {
        String s;
        while (true) {
            ucitajOstavljenog();
            s = JOptionPane.showInputDialog("Unos slova h za prekid,svi drugi znakovi nastavljaju unos ostavljenih");
            if (s.toLowerCase().equals("h")) {
                break;
            }
        }
    }

    private void ucitajOstavljenog() {
        JOptionPane.showMessageDialog(null, "Unos novo ostavljenog");
        Ostavljen ostavljen = new Ostavljen();
        ostavljen.setSifra(Pomocno.ucitajBroj("Učitaj šifru"));
        ostavljen.setMajica(Pomocno.ucitajString("Učitaj majicu"));
        ostavljen.setAsocijalno(Pomocno.ucitajBoolean("Učitaj asocijalno (true za DA, false za NE)"));
        ostavljen.setIndiferentno(Pomocno.ucitajBoolean("Unesi indiferentno(true/false)"));
        ostavljen.setIntrovertno(Pomocno.ucitajBoolean("Učitaj introvertno (true/false)"));
        ostavljen.setVesta(Pomocno.ucitajString("Napiši kroj omiljene veste"));
        
        
        ostavljen.setNeprijatelj(ucitajNeprijatelja());
        
        ostavljeni.add(ostavljen);
        
    }

    private Neprijatelj ucitajNeprijatelja() {
        Neprijatelj neprijatelj = new Neprijatelj();
        neprijatelj.setSifra(Pomocno.ucitajBroj("Unesi šifru neprijatelja"));
        neprijatelj.setNarukvica(Pomocno.ucitajBroj("Unesi broj narukvica na obje ruke"));
        neprijatelj.setHlace(Pomocno.ucitajString("Unesi najgore hlače"));
        neprijatelj.setBojaOciju(Pomocno.ucitajString("Unesi boju očiju"));
        neprijatelj.setStilFrizure(Pomocno.ucitajString("Unesi stil frizure"));
        neprijatelj.setSuknja(Pomocno.ucitajString("Unesi omiljeni kroj suknje"));
        return neprijatelj;
    }

    private void ispisiIndiferentnost() {
        for(Ostavljen ostavljen : ostavljeni){
            System.out.println(ostavljen.isIndiferentno());
        }
    }

}


