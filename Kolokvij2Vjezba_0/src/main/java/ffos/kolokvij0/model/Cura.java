/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Jure
 */
@Entity
@Table
public class Cura extends Entitet {
    
    private double maraka;
    private String vesta;
    private double kuna;
    private String dukserica;

    public double getMaraka() {
        return maraka;
    }

    public void setMaraka(double maraka) {
        this.maraka = maraka;
    }

    public String getVesta() {
        return vesta;
    }

    public void setVesta(String vesta) {
        this.vesta = vesta;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }

    public String getDukserica() {
        return dukserica;
    }

    public void setDukserica(String dukserica) {
        this.dukserica = dukserica;
    }
    
    @Override
    public String toString() {
        return "Maraka: " + getMaraka()+ " " + "Vesta: " + getVesta()+ " Kuna: " + getKuna() + " " + "Dukserica: " + getDukserica();
    }
    
    
}