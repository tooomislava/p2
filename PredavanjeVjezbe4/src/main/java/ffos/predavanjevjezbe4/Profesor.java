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
public class Profesor extends Zaposlenik{
    private String titula;

    public Profesor() {
    }

    

    public Profesor(String titula, float primanja, String ime, String prezime, int visina, boolean student) {
        super(primanja, ime, prezime, visina, student);
        this.titula = titula;
    }

    
    
    
    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public int getZasticeno() {
        return zasticeno;
    }

    public void setZasticeno(int zasticeno) {
        this.zasticeno = zasticeno;
    }
    
    
}
