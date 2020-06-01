/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Kontakt;
import ffos.model.Osoba;
import java.util.List;

/**
 *
 * @author Jure
 */
public class ObradaKontakt extends Obrada<Kontakt> {

    @Override
    public List<Kontakt> read() {

        return session.createQuery("from Kontakt").list();
         
    }
    
    
} 
