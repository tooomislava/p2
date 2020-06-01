/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe4;

/**
 *
 * @author Jure
 */
public class ObradaIznimaka {

    public ObradaIznimaka() {
        int i[] = new int[2];
        try { 
            i[2] = Integer.parseInt("j");
            //catch se izvrsava samo ako se odgodi iznimka
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nije dobro");
        } catch (NumberFormatException e) {
            System.out.println("Nije broj");
        } catch (Exception e) {
            e.printStackTrace();//u konzolu ispisuje sta se trebalo dogodit ali nece aplikacij apuknut
        } finally { //ovdje uvijek ulazi
            
        }
    }

    public static void main(String[] args) {
        new ObradaIznimaka();

    }
}
