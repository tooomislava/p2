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
public class Muskarac extends Entitet {
    
    private Long narukvica;
    private String bojaociju;
    private Boolean indiferentno;

    public Long getNarukvica() {
        return narukvica;
    }

    public void setNarukvica(Long narukvica) {
        this.narukvica = narukvica;
    }

    public String getBojaociju() {
        return bojaociju;
    }

    public void setBojaociju(String bojaociju) {
        this.bojaociju = bojaociju;
    }

    public Boolean getIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(Boolean indiferentno) {
        this.indiferentno = indiferentno;
    }
    
    
    
}