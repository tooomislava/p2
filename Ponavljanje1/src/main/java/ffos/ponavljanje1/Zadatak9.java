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
public class Zadatak9 {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Unesite tekst ocjene");
        switch (s) {
            case "nedovoljan":
                System.out.println("1");
                break;
            case "dovoljan":
                System.out.println("2");
                break;
            case "dobar":
                System.out.println("3");
                break;
            case "vrlo dobar":
                System.out.println("4");
                break;
            case "odličan":
                System.out.println("5");
                break;
        }
    }

}
