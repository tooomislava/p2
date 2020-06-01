/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

/**
 *
 * @author Jure
 */
public class Zarucnik {

    private int sifra;
    private boolean indiferentno;
    private int prstena;
    private float kuna;
    private boolean ekstrovertno;
    private boolean introvertno;
    private Ostavljen ostavljen;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public boolean isIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(boolean indiferentno) {
        this.indiferentno = indiferentno;
    }

    public int getPrstena() {
        return prstena;
    }

    public void setPrstena(int prstena) {
        this.prstena = prstena;
    }

    public float getKuna() {
        return kuna;
    }

    public void setKuna(float kuna) {
        this.kuna = kuna;
    }

    public boolean isEkstrovertno() {
        return ekstrovertno;
    }

    public void setEkstrovertno(boolean ekstrovertno) {
        this.ekstrovertno = ekstrovertno;
    }

    public boolean isIntrovertno() {
        return introvertno;
    }

    public void setIntrovertno(boolean introvertno) {
        this.introvertno = introvertno;
    }

    public Ostavljen getOstavljen() {
        return ostavljen;
    }

    public void setOstavljen(Ostavljen ostavljen) {
        this.ostavljen = ostavljen;
    }


    

}