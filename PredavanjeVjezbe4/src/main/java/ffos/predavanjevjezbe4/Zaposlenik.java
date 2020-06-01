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
public class Zaposlenik extends Osoba{
    
    private float primanja;

    public Zaposlenik() {
        super();
    }

    public Zaposlenik(float primanja, String ime, String prezime, int visina, boolean student) {
        super(ime, prezime, visina, student);
        this.primanja = primanja;
    }
    
    

    public float getPrimanja() {
        return primanja;
    }

    public void setPrimanja(float primanja) {
        this.primanja = primanja;
    }
    
    
    
    
}
