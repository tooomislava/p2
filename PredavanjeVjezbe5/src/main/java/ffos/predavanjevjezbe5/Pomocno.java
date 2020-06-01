/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Pomocno {
    
        public static int ucitajBroj(String poruka) {
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
    
}
