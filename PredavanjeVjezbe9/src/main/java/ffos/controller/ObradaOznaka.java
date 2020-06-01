/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Kontakt;
import ffos.model.Oznaka;
import java.util.List;


/**
 *
 * @author Jure
 */
public class ObradaOznaka extends Obrada<Oznaka> {

    @Override
    public List<Oznaka> read() {

        return session.createQuery("from Oznaka").list();
         
    }
    
    
} 
