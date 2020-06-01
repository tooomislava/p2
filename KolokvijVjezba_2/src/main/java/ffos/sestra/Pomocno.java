/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.sestra;

import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Pomocno {
    
    public static int ucitajBroj(String poruka){
        
        while(true){
            
            try{
                return Integer.parseInt
        (JOptionPane.showInputDialog(poruka));
                
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Morate unijeti cijeli broj!");
               
            }
            
        }
        
    }
    
      public static String ucitajString(String poruka){
        String s;
        
        while (true){
            s=JOptionPane.showInputDialog(poruka);
            if (s.trim().length()==0){
                JOptionPane.showMessageDialog(null, "Unos obavezan!");
                continue;
            }
            
            return s;
        }
    }
    
      
         public static float ucitajFloat(String poruka){
        
        while(true){
            
            try {
                return Float.parseFloat(
                        JOptionPane
                                .showInputDialog(poruka)
                );

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Morate unijeti decimalni broj");
            }
            
        }
    }
}
