/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Jure
 */
@Entity
@Table
public class Sestra extends Entitet {
    
    private Date treciputa;
    private Long nausnica;
    private String suknja;
    private String bojaociju;
    private Date prviputa;
    private double kuna;

    public Date getTreciputa() {
        return treciputa;
    }

    public void setTreciputa(Date treciputa) {
        this.treciputa = treciputa;
    }

    public Long getNausnica() {
        return nausnica;
    }

    public void setNausnica(Long nausnica) {
        this.nausnica = nausnica;
    }

    public String getSuknja() {
        return suknja;
    }

    public void setSuknja(String suknja) {
        this.suknja = suknja;
    }

    public String getBojaociju() {
        return bojaociju;
    }

    public void setBojaociju(String bojaociju) {
        this.bojaociju = bojaociju;
    }

    public Date getPrviputa() {
        return prviputa;
    }

    public void setPrviputa(Date prviputa) {
        this.prviputa = prviputa;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }
    
    @Override
    public String toString() {
        return "Treci puta: " + getTreciputa() + " " + "Nausnica: " + getNausnica()+ " Suknja: " + getSuknja()+ " " + "Boja očiju: " + getBojaociju() + " Prvi puta: " + getPrviputa() + " Kuna: " + getKuna();
    }
    
    
}