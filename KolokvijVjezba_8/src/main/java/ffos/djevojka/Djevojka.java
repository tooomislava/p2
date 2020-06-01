/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.djevojka;

import java.util.Date;

/**
 *
 * @author Jure
 */
public class Djevojka {
    
    public int sifra;
    public boolean asocijalno;
    public String majica;
    public Date prviPuta;
    public float kuna;
    public String dukserica;
    public Snasa snasa;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public boolean isAsocijalno() {
        return asocijalno;
    }

    public void setAsocijalno(boolean asocijalno) {
        this.asocijalno = asocijalno;
    }

    public String getMajica() {
        return majica;
    }

    public void setMajica(String majica) {
        this.majica = majica;
    }

    public Date getPrviPuta() {
        return prviPuta;
    }

    public void setPrviPuta(Date prviPuta) {
        this.prviPuta = prviPuta;
    }

    public float getKuna() {
        return kuna;
    }

    public void setKuna(float kuna) {
        this.kuna = kuna;
    }

    public String getDukserica() {
        return dukserica;
    }

    public void setDukserica(String dukserica) {
        this.dukserica = dukserica;
    }

    public Snasa getSnasa() {
        return snasa;
    }

    public void setSnasa(Snasa snasa) {
        this.snasa = snasa;
    }
    
}
