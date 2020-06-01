/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.cura;

import java.util.Date;

/**
 *
 * @author Jure
 */
public class Cura {
    
    public int sifra;
    public String bojaOciju;
    public Date drugiPuta;
    public Date prviPuta;
    public float gustoca;
    public int prsten;
    public Punica punica;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getBojaOciju() {
        return bojaOciju;
    }

    public void setBojaOciju(String bojaOciju) {
        this.bojaOciju = bojaOciju;
    }

    public Date getDrugiPuta() {
        return drugiPuta;
    }

    public void setDrugiPuta(Date drugiPuta) {
        this.drugiPuta = drugiPuta;
    }

    public Date getPrviPuta() {
        return prviPuta;
    }

    public void setPrviPuta(Date prviPuta) {
        this.prviPuta = prviPuta;
    }

    public float getGustoca() {
        return gustoca;
    }

    public void setGustoca(float gustoca) {
        this.gustoca = gustoca;
    }

    public int getPrsten() {
        return prsten;
    }

    public void setPrsten(int prsten) {
        this.prsten = prsten;
    }

    public Punica getPunica() {
        return punica;
    }

    public void setPunica(Punica punica) {
        this.punica = punica;
    }

    
}
