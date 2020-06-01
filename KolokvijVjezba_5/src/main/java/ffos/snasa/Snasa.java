/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.snasa;

/**
 *
 * @author Jure
 */
public class Snasa {
    
    public String sifra;
    public float lipa;
    public int ogrlica;
    public String modelaNaocala;
    public String majica;
    public boolean asocijalno;
    public Djevojka djevojka;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public float getLipa() {
        return lipa;
    }

    public void setLipa(float lipa) {
        this.lipa = lipa;
    }

    public int getOgrlica() {
        return ogrlica;
    }

    public void setOgrlica(int ogrlica) {
        this.ogrlica = ogrlica;
    }

    public String getModelaNaocala() {
        return modelaNaocala;
    }

    public void setModelaNaocala(String modelaNaocala) {
        this.modelaNaocala = modelaNaocala;
    }

    public String getMajica() {
        return majica;
    }

    public void setMajica(String majica) {
        this.majica = majica;
    }

    public boolean isAsocijalno() {
        return asocijalno;
    }

    public void setAsocijalno(boolean asocijalno) {
        this.asocijalno = asocijalno;
    }

    public Djevojka getDjevojka() {
        return djevojka;
    }

    public void setDjevojka(Djevojka djevojka) {
        this.djevojka = djevojka;
    }
    
}
