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
public class Zadatak7 {
    public static void main(String[] args) {
        
        int i= Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
        if(i%2==0){
            System.out.println("Osijek");
        }else {
            for(int j=1; j<10; j++){
                System.out.print("Ne");
            }
        }
        
    }
}
