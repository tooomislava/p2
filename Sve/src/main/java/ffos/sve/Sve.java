/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.sve;

/**
 *
 * @author Jure
 */
public class Sve {
    psvm

   //ISPISIVANJE VRIJEDNOSTI BOJE OČIJU SA SVIH INSTANCI
    private void ispisiBojuOciju() {

        for (Cura cura : cure) {
            System.out.println("Cura sa sifrom " + cura.getSifra() + " ima " + cura.getBojaOciju() + " boju ociju.");
        }
    }
    
//STRING ISPISIVANJE BROJA ZNAKOVA U JEDNOM STRINGU

    private void ispisiZnakove() {

        List<Punica> listaIspisiZnakove = new ArrayList<>();
        for (Cura cura : cure) {
            if (cura.getPunica().getVesta() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            int count = 0;

            for (int i = 0; i < cura.getPunica().getVesta().length(); i++) {
                if (cura.getPunica().getVesta().charAt(i) != ' ') {
                    count++;
                }
            }

            System.out.println("Zbroj znakovnih vrijednosti je " + count);
        }

    }
    
        //STRING ISPISIVANJE VIŠE ZNAKOVNIH VRIJEDNOSTI 
    private void ispisiZnakove() {

        List<Punica> listaIspisiZnakove = new ArrayList<>();
        for (Cura cura : cure) {
            if (cura.getPunica().getVesta() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            int count = 5;

            for (int i = 0; i < cura.getPunica().getVesta().length(); i++) {
                if (cura.getPunica().getVesta().charAt(i) != ' ') {
                    count++;
                }
            }

            if (cura.getPunica().getHlace() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            count = 5;

            for (int i = 0; i < cura.getPunica().getHlace().length(); i++) {
                if (cura.getPunica().getHlace().charAt(i) != ' ') {
                    count++;
                }
            }

            if (cura.getPunica().getKratkMajica() instanceof java.lang.String) {
                listaIspisiZnakove.add(cura.getPunica());
            }

            count = 5;

            for (int i = 0; i < cura.getPunica().getKratkMajica().length(); i++) {
                if (cura.getPunica().getKratkMajica().charAt(i) != ' ') {
                    count++;
                }
            }

            System.out.println("Zbroj znakovnih vrijednosti je " + count);
        }

    }

    

    //BOOLEAN ISPISIVANJE JEDNE LOGIČKE VRIJEDNOSTI U ENTITETU
    private void ispisIntroventnihNeprijateljica() {
        List<Neprijateljica> listaIntroventihNeprijateljica = new ArrayList<>();
        for (Prijateljica prijateljica : prijateljice) {
            if (prijateljica.getNeprijateljica().isIntrovertno()) {
                listaIntroventihNeprijateljica.add(prijateljica.getNeprijateljica());
            }
        }
        System.out.println("Zbroj introventnih prijateljica iznosi: " + listaIntroventihNeprijateljica.size());
    }

    
    private void ispisIndiferentnihMuskaraca() {

        List<Muskarac> listaAsocijalnihMuskaraca = new ArrayList<>();
        for (Ostavljen ostavljen : ostavljeni) {
            if (ostavljen.getMuskarac().isAsocijalno()) {
                listaAsocijalnihMuskaraca.add(ostavljen.getMuskarac());
            }
        }

        System.out.println("Zbroj asocijalnih prijateljica iznosi: " + listaAsocijalnihMuskaraca.size());

    }
    
     //BOOLEAN BROJANJE ZADNJI ZADATAK SVI BOOLEAN
    private void ispisiBoolean() {
// for (klasa, instanca klase : lista)

        int s = 0;
        for (Ostavljen ostavljen : ostavljeni) {
            if (ostavljen.muskarac.isAsocijalno() != false) {
                s++;
            }
        }
        System.out.println("Broj puta koliko je uneseno asocijalno ili 'true' je " + s);
    }

 //BOOLEAN ISPISIVANJE SVIH LOGIČKIH TIPOVA PODATAKA 
    private void ispisiBoolean() {

        int s = 0;
        for (Zarucnik zarucnik : zarucnici) {
            if (zarucnik.isEkstrovertno() != false) {
                s++;
            }
            if (zarucnik.isIndiferentno() != false) {
                s++;
            }
            if (zarucnik.isIntrovertno() != false) {
                s++;
            }
        }

        System.out.println(s);

    }

    //INT ISPISIVANJE SVIH CIJELIH BROJEVA ZNAKOVI
    
     private void ispisiBroj() {
        int suma = 0;
        for (Snasa snasa : snase) {
            suma = snasa.djevojka.getSifra() + snasa.djevojka.getPrsten() + snasa.djevojka.getNausnica();
        }
        System.out.println("Suma svih unesenih cijelih brojeva je: " + suma);

    }
   
}
