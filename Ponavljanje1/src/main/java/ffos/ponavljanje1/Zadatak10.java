/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ponavljanje1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Zadatak10 {
    public static void main(String[] args) {
        int i ;
        
        while(true){
            i=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
            
            if(i==5){
                break;
            }
            
            System.out.println("Osijek");
        }
        
    }
}
