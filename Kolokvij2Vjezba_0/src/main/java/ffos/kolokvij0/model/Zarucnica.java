/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jure
 */

@Entity
@Table
public class Zarucnica extends Entitet {
    
    private String bojakose;
    private String jmbag;
    private String hlace;
    private String modelnaocala;
    private Long narukvica;
    private Long ogrlica;
    
    @ManyToOne
    private Cura cura;

    public String getBojakose() {
        return bojakose;
    }

    public void setBojakose(String bojakose) {
        this.bojakose = bojakose;
    }

    public String getJmbag() {
        return jmbag;
    }

    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }

    public String getHlace() {
        return hlace;
    }

    public void setHlace(String hlace) {
        this.hlace = hlace;
    }

    public String getModelnaocala() {
        return modelnaocala;
    }

    public void setModelnaocala(String modelnaocala) {
        this.modelnaocala = modelnaocala;
    }

    public Long getNarukvica() {
        return narukvica;
    }

    public void setNarukvica(Long narukvica) {
        this.narukvica = narukvica;
    }

    public Long getOgrlica() {
        return ogrlica;
    }

    public void setOgrlica(Long ogrlica) {
        this.ogrlica = ogrlica;
    }

    public Cura getCura() {
        return cura;
    }

    public void setCura(Cura cura) {
        this.cura = cura;
    }
    
    @Override
    public String toString() {
        return "Boja kose: " + getBojakose()+ " " + "Jmbag: " + getJmbag()+ " Hlače: " + getHlace()+ " " + "Modeel naočala: " + getModelnaocala() + " Narukvica: " + getNarukvica() + "Ogrlica: " + getOgrlica() + "Cura: " + getCura();
    }
    
}