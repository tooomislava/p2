/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.snasa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private List<Snasa> snase;

    public Start() {

        JOptionPane.showMessageDialog(null, "Dobrodošli u program Snaša!");

        snase = new ArrayList<>();
        ucitajSnase();
        ispisiOgrlice();
        ispisiBroj();

    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajSnase() {

        String s;

        while (true) {
            ucitajSnasu();
            s = JOptionPane.showInputDialog("Unos slova o unesite za prekid rada programa sestra!");
            if (s.toLowerCase().equals("o")) {
                break;
            }
        }

    }

    private void ucitajSnasu() {
        JOptionPane.showMessageDialog(null, "Učitajte novu snašu");
        Snasa snasa = new Snasa();
        snasa.setSifra(Pomocno.ucitajString("Unesite šifru"));
        snasa.setLipa(Pomocno.ucitajFloat("Unesite lipe"));
        snasa.setOgrlica(Pomocno.ucitajBroj("Unesite veličinu ogrlice"));
        snasa.setModelaNaocala(Pomocno.ucitajString("Unesite model naočala"));
        snasa.setMajica(Pomocno.ucitajString("Unesite boju majice"));
        snasa.setAsocijalno(Pomocno.ucitajBoolean("Unesite asocijalno(true/false)"));

        snasa.setDjevojka(ucitajDjevojku());

        snase.add(snasa);
    }

    private Djevojka ucitajDjevojku() {

        Djevojka djevojka = new Djevojka();
        djevojka.setSifra(Pomocno.ucitajBroj("Unesite šifru djevojke"));
        djevojka.setBojaOciju(Pomocno.ucitajString("Unesite boju očiju"));
        djevojka.setCarape(Pomocno.ucitajString("Unesite čarape"));
        djevojka.setDrugiPuta(Pomocno.ucitajDate("Unesite datum"));
        djevojka.setPrsten(Pomocno.ucitajBroj("Unesite broj prstena"));
        djevojka.setNausnica(Pomocno.ucitajBroj("Unesite broj naušnica"));
        return djevojka;

    }

    private void ispisiOgrlice() {
        for (Snasa snasa : snase) {
            System.out.println("Snaša sa sifrom " + snasa.getSifra() + " ima " + snasa.getOgrlica() + " ogrlica");
        }
    }

    private void ispisiBroj() {
        int suma = 0;
        for (Snasa snasa : snase) {
            suma = snasa.djevojka.getSifra() + snasa.djevojka.getPrsten() + snasa.djevojka.getNausnica();
        }
        System.out.println("Suma svih unesenih cijelih brojeva je: " + suma);

    }

}
