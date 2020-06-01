/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe5;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Start {

    private int rezultat;

    public Start() {
        /*
        String s=JOptionPane.showInputDialog("Unesi ime");
        
        String ime = "";
        
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0, 3));
        System.out.println(s.toUpperCase().substring(0, 3));
        
        ime=JOptionPane.showInputDialog("Još jedno ime");
         */
 /*prostor klase; u javi postoje 5 vrsti metoda; 1. je konstruktor;  2. je metoda određenog tipa koja vraca vrijednost 
        3. metoda određenog tipa koja prima parametre i vraća vrijednost, ne prima parametre*/

        int i = ucitajBroj();

        int j = Pomocno.ucitajBroj("Unesi drugi broj");

        int k = ucitajBroj("Unesi treći broj");

        ispisi(i + j + k);

        rezultat = i + 2 * j + 3 * k;

        mojIspis();

        //JOptionPane.showMessageDialog(null, i + j + k);
    }

    private int ucitajBroj() {
        while (true) {
            try {

                return Integer.parseInt(
                        JOptionPane.showInputDialog("Broj")
                );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Niste unjeli broj");
            }

        }
    }
    //return 0;

    private int ucitajBroj(String poruka) {
        while (true) {
            try {

                return Integer.parseInt(
                        JOptionPane.showInputDialog(poruka)
                );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Niste unjeli broj");
            }

        }
    }

    //4. metoda koja prma parametre, tipa je void i ne vraca vrijednost
    private void ispisi(int broj) {
        JOptionPane.showMessageDialog(null, broj);
        //Start.main(null);
        // Start.mojIspis();
    }

    public static void main(String[] args) {
        //pozivam konstruktor; u konstruktoru pisem kod
        //new Start();

        //zakomentirala sam new start
        Strukture strukture = new Strukture();
        strukture.lista();
    }

    //5. metoda koja ne prima parametre i ne vraca vrijednost
    private void mojIspis() {
        //ako se metoda generira od strane netbeansa imate ovaj throw....koji treba obriisati
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        JOptionPane.showMessageDialog(null, rezultat);
    }

}
