/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.predavanjevjezbe4;

/**
 *
 * @author Jure
 */
public class Zupanija {

    private String ime;
    private String polozaj;
    private boolean velika;

    public Zupanija() {

    }

    public Zupanija(String ime, String polozaj, boolean velika) {
        this.ime = ime;
        this.polozaj = polozaj;
        this.velika = velika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPolozaj() {
        return polozaj;
    }

    public void setPolozaj(String polozaj) {
        this.polozaj = polozaj;
    }

    public boolean isVelika() {
        return velika;
    }

    public void setVelika(boolean velika) {
        this.velika = velika;
    }

}
