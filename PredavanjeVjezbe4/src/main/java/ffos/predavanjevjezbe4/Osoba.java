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
public abstract class Osoba { //extends Object

    /*
    ne valja
        String ime;
        String prezime;
        int visina;
        boolean student;
     */

    private String ime;
    private String prezime;
    private int visina;
    private boolean student;
    
    protected int zasticeno;

    //prazni konstruktor
    //ovakva klasa se zove POJO
    public Osoba() {
        System.out.println("Konstruktor u klasi Osoba");
    }

    //puni konstruktor
    public Osoba(String ime, String prezime, int visina, boolean student) {
        this.ime = ime;
        this.prezime = prezime;
        this.visina = visina;
        this.student = student;
        
        
        
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

}
