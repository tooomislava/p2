/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private List<Zarucnik> zarucnici;

    public Start() {

        JOptionPane.showMessageDialog(null, "Dobrodošli u program zaručnici");

        zarucnici = new ArrayList<>();
        ucitajZarucnike();
        ispisiEkstrovertnost();
        ispisiBoolean();

    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajZarucnike() {
        String s;
        while (true) {
            ucitajZarucnika();
            s = JOptionPane.showInputDialog("Unos slova q za prekid,svi drugi znakovi nastavljaju unos zaručenih");
            if (s.toLowerCase().equals("q")) {
                break;
            }
        }
    }

    private void ucitajZarucnika() {
        JOptionPane.showMessageDialog(null, "Učitaj novog zaručnika");
        Zarucnik zarucnik = new Zarucnik();
        zarucnik.setSifra(Pomocno.ucitajBroj("Unesite šifru"));
        zarucnik.setIndiferentno(Pomocno.ucitajBoolean("Unesite indiferentno, true/false"));
        zarucnik.setPrstena(Pomocno.ucitajBroj("Uniesite broj prstena"));
        zarucnik.setKuna(Pomocno.ucitajFloat("Unesite iznos u kunama"));
        zarucnik.setEkstrovertno(Pomocno.ucitajBoolean("Unesite ekstrovertno, true/false"));
        zarucnik.setIntrovertno(Pomocno.ucitajBoolean("Unesite introvertno, true/false"));

        zarucnik.setOstavljen(ucitajOstavljen());

        zarucnici.add(zarucnik);
    }

    private Ostavljen ucitajOstavljen() {

        Ostavljen ostavljen = new Ostavljen();
        ostavljen.setSifra(Pomocno.ucitajBroj("Unesite šifru"));
        ostavljen.setStilFrizure(Pomocno.ucitajString("Unesite stil frizure"));
        ostavljen.setAsocijalno(Pomocno.ucitajBoolean("Unesite asocijalno, true/false"));
        ostavljen.setMajica(Pomocno.ucitajString("Unesite majicu"));
        ostavljen.setHlace(Pomocno.ucitajString("Unesite hlače"));
        ostavljen.setGustoca(Pomocno.ucitajFloat("Unesite gustoću"));
        return ostavljen;

    }

    private void ispisiEkstrovertnost() {

        for (Zarucnik zarucnik : zarucnici) {
            System.out.println(zarucnik.isEkstrovertno());
        }
    }

    private void ispisiBoolean() {
        
        int s = 0;
        for(Zarucnik zarucnik : zarucnici){
            if(zarucnik.isEkstrovertno() != false){
                s++;
            }if (zarucnik.isIndiferentno() != false){
                s++;
            }if (zarucnik.isIntrovertno() != false){
                s++;
            }
        }
        
        System.out.println(s);
    }

    
    
}
