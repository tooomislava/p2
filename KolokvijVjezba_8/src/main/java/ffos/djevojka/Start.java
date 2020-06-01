/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.djevojka;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private List<Djevojka> djevojke;

    public Start() {

        JOptionPane.showMessageDialog(null, "Dobrodošli u program DJEVOJKA!");

        djevojke = new ArrayList<>();
        ucitajDjevojke();
        ispisiKune();

    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajDjevojke() {

        String s;

        while (true) {
            ucitajDjevojku();
            s = JOptionPane.showInputDialog("Unos slova l unesite za prekid rada programa sestra!");
            if (s.toLowerCase().equals("l")) {
                break;
            }
        }
    }

    private void ucitajDjevojku() {

        JOptionPane.showMessageDialog(null, "Učitajte novu djevojku!");
        Djevojka djevojka = new Djevojka();
        djevojka.setSifra(Pomocno.ucitajBroj("Unesite šifru djevojke"));
        djevojka.setAsocijalno(Pomocno.ucitajBoolean("Unesite asocijalno, true/false"));
        djevojka.setMajica(Pomocno.ucitajString("Unesite boju majice"));
        djevojka.setPrviPuta(Pomocno.ucitajDate("Unesite datum rođenja cure"));
        djevojka.setKuna(Pomocno.ucitajFloat("Unesite kune"));
        djevojka.setDukserica(Pomocno.ucitajString("Unesite boju dukserice"));

        djevojka.setSnasa(ucitajSnasu());
        djevojke.add(djevojka);
    }

    private Snasa ucitajSnasu() {

        JOptionPane.showMessageDialog(null, "Učitajte novu snašu!");
        Snasa snasa = new Snasa();
        snasa.setSifra(Pomocno.ucitajBroj("Unesite šifru snaše"));
        snasa.setVesta(Pomocno.ucitajString("Unesite boju veste"));
        snasa.setEuro(Pomocno.ucitajFloat("Unesite količinu eura"));
        snasa.setBojaKose(Pomocno.ucitajString("Unesite boju kose"));
        snasa.setHaljina(Pomocno.ucitajString("Unesite boju haljine"));
        snasa.setNausnica(Pomocno.ucitajBroj("Unesite broj naušnica"));
        return snasa;
    }

    private void ispisiKune() {
        for (Djevojka djevojka : djevojke) {
            System.out.println("Djevojka sa sifrom "
                    + djevojka.getSifra() + " ima "
                    + djevojka.getKuna() + " kuna");
        }
    }
}
