/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Kontakt extends Entitet {

    @ManyToOne
    private Osoba osoba;

    private String vrijednost;

    @ManyToOne
    private VrstaKontakta vrstaKontakta;

    @ManyToMany
    private List<Oznaka> oznake = new ArrayList<>();

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

    public VrstaKontakta getVrstaKontakta() {
        return vrstaKontakta;
    }

    public void setVrstaKontakta(VrstaKontakta vrstaKontakta) {
        this.vrstaKontakta = vrstaKontakta;
    }

    public List<Oznaka> getOznake() {
        return oznake;
    }

    public void setOznake(List<Oznaka> oznake) {
        this.oznake = oznake;
    }

}
