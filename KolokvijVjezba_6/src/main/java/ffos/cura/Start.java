/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.cura;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private List<Cura> cure;

    public Start() {

        JOptionPane.showMessageDialog(null, "Dobrodošli u program CURA!");

        cure = new ArrayList<>();
        ucitajCure();
        ispisiBojuOciju();
        ispisiZnakove();
    }

    public static void main(String[] args) {

        new Start();

    }

    private void ucitajCure() {

        String s;

        while (true) {
            ucitajCuru();
            s = JOptionPane.showInputDialog("Unos slova n unesite za prekid rada programa sestra!");
            if (s.toLowerCase().equals("n")) {
                break;
            }
        }
    }

    private void ucitajCuru() {

        JOptionPane.showMessageDialog(null, "Učitajte novu curu!");
        Cura cura = new Cura();
        cura.setSifra(Pomocno.ucitajBroj("Unesite šifru cure"));
        cura.setBojaOciju(Pomocno.ucitajString("Unesite boju očiju cure"));
        cura.setDrugiPuta(Pomocno.ucitajDate("Unesite datum kada se prohodali s curom"));
        cura.setPrviPuta(Pomocno.ucitajDate("Unesite datum završetka veze"));
        cura.setGustoca(Pomocno.ucitajFloat("Unesite gustoću cure"));
        cura.setPrsten(Pomocno.ucitajBroj("Unesite veličinu prstena cure"));

        cura.setPunica(ucitajPunica());

        cure.add(cura);
    }

    private Punica ucitajPunica() {

        Punica punica = new Punica();
        punica.setSifra(Pomocno.ucitajBroj("Unesite šifru za punicu"));
        punica.setVesta(Pomocno.ucitajString("Unesite boju veste"));
        punica.setIntrovertno(Pomocno.ucitajBoolean("Unesite introvertno punice, true/false"));
        punica.setHlace(Pomocno.ucitajString("Unesite boju hlača punice"));
        punica.setKratkMajica(Pomocno.ucitajString("Unesite boju kratke majice punice"));
        punica.setAsocijalno(Pomocno.ucitajBoolean("Unesite asocijalno punice, true/false"));
        return punica;
    }

    private void ispisiBojuOciju() {

        for (Cura cura : cure) {
            System.out.println("Cura sa sifrom " + cura.getSifra() + " ima " + cura.getBojaOciju() + " boju ociju.");
        }
    }

    private void ispisiZnakove() {

        List<Punica> listaIspisiZnakove = new ArrayList<>();
        for (Cura cura : cure) {
            if (cura.getPunica().getVesta() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            int count = 5;

            for (int i = 0; i < cura.getPunica().getVesta().length(); i++) {
                if (cura.getPunica().getVesta().charAt(i) != ' ') {
                    count++;
                }
            }

            if (cura.getPunica().getHlace() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            count = 5;

            for (int i = 0; i < cura.getPunica().getHlace().length(); i++) {
                if (cura.getPunica().getHlace().charAt(i) != ' ') {
                    count++;
                }
            }

            if (cura.getPunica().getKratkMajica() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            count = 5;

            for (int i = 0; i < cura.getPunica().getKratkMajica().length(); i++) {
                if (cura.getPunica().getKratkMajica().charAt(i) != ' ') {
                    count++;
                }
            }

            System.out.println("Zbroj znakovnih vrijednosti je " + count);
        }

    }

}
