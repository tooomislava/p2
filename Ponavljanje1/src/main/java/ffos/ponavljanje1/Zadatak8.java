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
public class Zadatak8 {
    public static void main(String[] args) {
        
        int b= Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
     
        boolean prim = true;
        
        for(int i=2; i<b; i++){
          if(b%i == 0){
            prim = false;
            break;
        }  
        }
        
        if(prim){
            System.out.println("Prim broj");
        }else{
            System.out.println("Nije prim");
        }
        
        
    }
}
