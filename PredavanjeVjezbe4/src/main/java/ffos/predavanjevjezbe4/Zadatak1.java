/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Zadatak1 {

    public Zadatak1() {
        //program unosi broj veci od 10 i ispisuje uneseni broj

        int i;

        for (;;) {
            try {
                i = Integer.parseInt(
                        JOptionPane.showInputDialog("Daj broj"));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Broj mora biti veći od 10");
                continue;
            }

            break;
        }

        System.out.println(i);

    }

    public static void main(String[] args) {

    }
}
