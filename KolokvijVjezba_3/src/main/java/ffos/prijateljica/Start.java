/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.prijateljica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private List<Prijateljica> prijateljice;

    public Start() {

        JOptionPane.showMessageDialog(null, "Dobrodošli u program prijateljica!");

        prijateljice = new ArrayList<>();
        ucitajPrijateljice();
        ispisiMarke();
        ispisIntroventnihNeprijateljica();
    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajPrijateljice() {
        String s;

        while (true) {
            ucitajPrijateljicu();
            s = JOptionPane.showInputDialog("Unos slova x unesite za prekid rada programa sestra!");
            if (s.toLowerCase().equals("x")) {
                break;
            }
        }
    }

    private void ucitajPrijateljicu() {

        JOptionPane.showMessageDialog(null, "Učitajte novu prijateljicu");
        Prijateljica prijateljica = new Prijateljica();
        prijateljica.setSifra(Pomocno.ucitajString("Učitajte šifru prijateljice"));
        prijateljica.setNarukvica(Pomocno.ucitajBroj("Unesite broj narukvica"));
        prijateljica.setNovcici(Pomocno.ucitajFloat("Unesite količinu novčića"));
        prijateljica.setMarke(Pomocno.ucitajFloat("Unesite količinu maraka"));
        prijateljica.setVesta(Pomocno.ucitajString("Unesite veličinu veste"));
        prijateljica.setModelNaocala(Pomocno.ucitajString("Unesite modela željenih naočala"));

        prijateljica.setNeprijateljica(ucitajNeprijateljica());

        prijateljice.add(prijateljica);

    }

    private Neprijateljica ucitajNeprijateljica() {

        Neprijateljica neprijateljica = new Neprijateljica();
        neprijateljica.setSifra(Pomocno.ucitajBroj("Unesite šifru neprijateljice"));
        neprijateljica.setIntrovertno(Pomocno.ucitajBoolean("Unesite introvertno, true/false"));
        neprijateljica.setSuknja(Pomocno.ucitajString("Unesite veličinu suknje"));
        neprijateljica.setEuro(Pomocno.ucitajFloat("Unesite količinu eura"));
        neprijateljica.setMajica(Pomocno.ucitajString("Unesite veličinu majice"));
        neprijateljica.setTreciPut(Pomocno.ucitajDate("Unesite datum - format ('dd.MM.yyyy')"));
        return neprijateljica;

    }

    private void ispisiMarke() {
        for (Prijateljica prijateljica : prijateljice) {
            System.out.println("Prijateljica sa sifrom " + prijateljica.getSifra() + " ima " + prijateljica.getMarke() + " maraka");
        }
    }

    private void ispisIntroventnihNeprijateljica() {
        List<Neprijateljica> listaIntroventihNeprijateljica = new ArrayList<>();
        for (Prijateljica prijateljica : prijateljice) {
            if (prijateljica.getNeprijateljica().isIntrovertno()) {
                listaIntroventihNeprijateljica.add(prijateljica.getNeprijateljica());
            }
        }
        System.out.println
        ("Zbroj introventnih prijateljica iznosi: " + 
                listaIntroventihNeprijateljica.size());
    }

}
