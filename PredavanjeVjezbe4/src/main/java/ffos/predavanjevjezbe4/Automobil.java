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
public class Automobil {
    
    private String naziv;
    private String konji;
    private int boja;
    private boolean brz;

    
    
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKonji() {
        return konji;
    }

    public void setKonji(String konji) {
        this.konji = konji;
    }

    public int getBoja() {
        return boja;
    }

    public void setBoja(int boja) {
        this.boja = boja;
    }

    public boolean isBrz() {
        return brz;
    }

    public void setBrz(boolean brz) {
        this.brz = brz;
    }
}
