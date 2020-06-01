/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.prijateljica;

/**
 *
 * @author Jure
 */
public class Prijateljica {

    public String sifra;
    public int narukvica;
    public float novcici;
    public float marke;
    public String vesta;
    public String modelNaocala;
    public Neprijateljica neprijateljica;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public int getNarukvica() {
        return narukvica;
    }

    public void setNarukvica(int narukvica) {
        this.narukvica = narukvica;
    }

    public float getNovcici() {
        return novcici;
    }

    public void setNovcici(float novcici) {
        this.novcici = novcici;
    }

    public float getMarke() {
        return marke;
    }

    public void setMarke(float marke) {
        this.marke = marke;
    }

    public String getVesta() {
        return vesta;
    }

    public void setVesta(String vesta) {
        this.vesta = vesta;
    }

    public String getModelNaocala() {
        return modelNaocala;
    }

    public void setModelNaocala(String modelNaocala) {
        this.modelNaocala = modelNaocala;
    }

    public Neprijateljica getNeprijateljica() {
        return neprijateljica;
    }

    public void setNeprijateljica(Neprijateljica neprijateljica) {
        this.neprijateljica = neprijateljica;
    }
}
