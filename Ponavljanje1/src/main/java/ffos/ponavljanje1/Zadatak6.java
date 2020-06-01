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
public class Zadatak6 {
    public static void main(String[] args) {
        int i=Integer.parseInt(JOptionPane.showInputDialog("Daj prvi broj"));
        int j=Integer.parseInt(JOptionPane.showInputDialog("Daj drugi broj"));
        int k=Integer.parseInt(JOptionPane.showInputDialog("Daj treći broj"));

           System.out.println(i);  
           System.out.println(j);    
           System.out.println(k);     

           if(i>j&& i>k){
               System.out.println(i);
           }
           
           if(j>i&& j>k){
               System.out.println(j);
           }
           
           if(k>i&& k>j){
               System.out.println(k);
           }
         }
    
    //testirati s 5, 5, 1
    
    
}
