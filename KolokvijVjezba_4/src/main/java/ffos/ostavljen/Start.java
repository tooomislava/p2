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

        JOptionPane.showMessageDialog(null, "Dobrodošli u program ostavljen!");

        ostavljeni = new ArrayList<>();
        ucitajOstavljene();
        ispisiIndiferentno();
        ispisIndiferentnihMuskaraca();

    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajOstavljene() {
        String s;

        while (true) {
            ucitajOstavljenog();
            s = JOptionPane.showInputDialog("Unos slova x unesite za prekid rada programa sestra!");
            if (s.toLowerCase().equals("x")) {
                break;
            }
        }
    }

    private void ucitajOstavljenog() {
        JOptionPane.showMessageDialog(null, "Učitajte novog ostavljenog!");
        Ostavljen ostavljen = new Ostavljen();
        ostavljen.setSifra(Pomocno.ucitajString("Učitajte šifru ostavljenog"));
        ostavljen.setGustoca(Pomocno.ucitajFloat("Učitajte gustoću ostavljenog"));
        ostavljen.setVesta(Pomocno.ucitajString("Unesite veličinu veste"));
        ostavljen.setPrstena(Pomocno.ucitajBroj("Unesite broj prstena"));
        ostavljen.setIndiferentno(Pomocno.ucitajBoolean("Unesite indiferentno (true/false)"));
        ostavljen.setKuna(Pomocno.ucitajFloat("Unesite kune"));

        ostavljen.setMuskarac(ucitajMuskarac());

        ostavljeni.add(ostavljen);

    }

    private Muskarac ucitajMuskarac() {
        Muskarac muskarac = new Muskarac();
        muskarac.setSifra(Pomocno.ucitajString("Učitajte šifru muškarca"));
        muskarac.setAsocijalno(Pomocno.ucitajBoolean("Unesite asocijalno (true/false)"));
        muskarac.setModelNaocala(Pomocno.ucitajString("Unesite model naočala"));
        muskarac.setOgrlica(Pomocno.ucitajBroj("Unesite broj ogrlica"));
        muskarac.setBojaOciju(Pomocno.ucitajString("Unesite boju očiju"));
        muskarac.setCarape(Pomocno.ucitajString("Unesite čarape"));
        return muskarac;

    }

    private void ispisiIndiferentno() {
        for (Ostavljen ostavljen : ostavljeni) {
            System.out.println("Ostavljen sa sifrom " + ostavljen.getSifra() + " ima " + ostavljen.isIndiferentno() + " indiferentnost");
        }
    }

    private void ispisIndiferentnihMuskaraca() {

        List<Muskarac> listaAsocijalnihMuskaraca = new ArrayList<>();
        for (Ostavljen ostavljen : ostavljeni) {
            if (ostavljen.getMuskarac().isAsocijalno()) {
                listaAsocijalnihMuskaraca.add(ostavljen.getMuskarac());
            }
        }

        System.out.println("Zbroj asocijalnih prijateljica iznosi: " + listaAsocijalnihMuskaraca.size());

    }

}
