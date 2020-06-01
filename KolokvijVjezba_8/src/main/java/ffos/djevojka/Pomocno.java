/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.djevojka;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Jure
 */
public class Pomocno {
    
    public static int ucitajBroj(String poruka){
        
        while(true){
            try{
                return Integer.parseInt(JOptionPane.showInputDialog(poruka));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Morate unijeti cijeli broj!");
            }
        }
        
    }
    
     public static String ucitajString(String poruka){
        
         while (true){
            String s = JOptionPane.showInputDialog(poruka);
            if (s.trim().length()==0){
                JOptionPane.showMessageDialog(null, "Obavezan unos!");
                continue;
            }
            return s;
        }

    }
     
    public static float ucitajFloat(String poruka){
        
        while(true){
            try {
                return Float.parseFloat(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Morate unijeti decimalni broj!");
            }
        }

    }
       
    public static boolean ucitajBoolean(String poruka){

        while(true){
            if (JOptionPane.showInputDialog(poruka).equals("true")){
                return true;
            }else if (JOptionPane.showInputDialog(poruka).equals("false")){
                return false;
            } else {
                JOptionPane.showMessageDialog(null, "Neispravan unos, morate unijeti 'true' ili 'false'!");
            }
        }

    }

    public static Date ucitajDate(String poruka) {

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        while(true) {
            try {
                return format.parse(JOptionPane.showInputDialog(poruka));
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Neispravan unos. Potreban format 'dd.MM.yyyy'");
            }
        }
    }
}
