/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.sestra;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private List<Sestra> sestre;

    public Start() {

        JOptionPane.showMessageDialog(null, "Dobrodošli u program sestra!");

        sestre = new ArrayList<>();
        ucitajSestre();
        ispisiBojaKose();

    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajSestre() {

        String s;

        while (true) {
            ucitajSestru();
            s = JOptionPane.showInputDialog("Unos slova f unesite za prekid rada programa sestra!");
            if (s.toLowerCase().equals("f"));
            break;
        }

    }

    private void ucitajSestru() {

        JOptionPane.showMessageDialog(null, "Učitajte novu sestru!");
        Sestra sestra = new Sestra();
        sestra.setSifra(Pomocno.ucitajString("Unesite šifru"));
        sestra.setNarukvica(Pomocno.ucitajBroj("Unesite broj narukvica"));
        sestra.setNovcici(Pomocno.ucitajFloat("Unesite broj novčića"));
        sestra.setKuna(Pomocno.ucitajFloat("Unesite kune"));
        sestra.setBojaKose(Pomocno.ucitajString("Unesite boju kose"));
        sestra.setNausnica(Pomocno.ucitajBroj("Unesite broj naušnica"));

        sestra.setSvekar(ucitajSvekar());

        sestre.add(sestra);
    }

    private Svekar ucitajSvekar() {

        Svekar svekar = new Svekar();
        svekar.setSifra(Pomocno.ucitajString("Unesite šifru"));
        svekar.setCarape(Pomocno.ucitajString("Unesite čarape"));
        svekar.setGustoca(Pomocno.ucitajFloat("Unesite gustoću svekra"));
        svekar.setKratkaMajica(Pomocno.ucitajString("Unesite kroj kratke majice"));
        svekar.setStilFrizure(Pomocno.ucitajString("Unesite stil frizure"));
        svekar.setBojaOciju(Pomocno.ucitajString("Unesite boju očiju"));
        return svekar;

    }

    private void ispisiBojaKose() {

        for (Sestra sestra : sestre) {
            System.out.println("Svekar sa sifrom " + sestra.getSifra() + " ima " + sestra.getBojaKose() + " oči.");
        }
    }

}
