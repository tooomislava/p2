/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ostavljen;

/**
 *
 * @author Jure
 */
public class Ostavljen {
    
    public String sifra;
    public float gustoca;
    public String vesta;
    public int prstena;
    public boolean indiferentno;
    public float kuna;
    public Muskarac muskarac;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public float getGustoca() {
        return gustoca;
    }

    public void setGustoca(float gustoca) {
        this.gustoca = gustoca;
    }

    public String getVesta() {
        return vesta;
    }

    public void setVesta(String vesta) {
        this.vesta = vesta;
    }

    public int getPrstena() {
        return prstena;
    }

    public void setPrstena(int prstena) {
        this.prstena = prstena;
    }

    public boolean isIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(boolean indiferentno) {
        this.indiferentno = indiferentno;
    }

    public float getKuna() {
        return kuna;
    }

    public void setKuna(float kuna) {
        this.kuna = kuna;
    }

    public Muskarac getMuskarac() {
        return muskarac;
    }

    public void setMuskarac(Muskarac muskarac) {
        this.muskarac = muskarac;
    }
    
}
