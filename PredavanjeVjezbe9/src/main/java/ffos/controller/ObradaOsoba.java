/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Entitet;
import ffos.model.Osoba;
import java.util.List;

/**
 *
 * @author Jure
 */
public class ObradaOsoba extends Obrada<Osoba> {

    @Override
    public List<Osoba> read() {

        return session.createQuery("from Osoba").list();
         
    }
    
    
}
