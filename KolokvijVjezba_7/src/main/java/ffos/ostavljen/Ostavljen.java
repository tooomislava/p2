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

    private int sifra;
    private String majica;
    private boolean asocijalno;
    private boolean indiferentno;
    private boolean introvertno;
    private String vesta;
    private Neprijatelj neprijatelj;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
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

    public boolean isIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(boolean indiferentno) {
        this.indiferentno = indiferentno;
    }

    public boolean isIntrovertno() {
        return introvertno;
    }

    public void setIntrovertno(boolean introvertno) {
        this.introvertno = introvertno;
    }

    public String getVesta() {
        return vesta;
    }

    public void setVesta(String vesta) {
        this.vesta = vesta;
    }

    public Neprijatelj getNeprijatelj() {
        return neprijatelj;
    }

    public void setNeprijatelj(Neprijatelj neprijatelj) {
        this.neprijatelj = neprijatelj;
    }

}
