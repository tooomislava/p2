/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Kontakt;
import ffos.model.VrstaKontakta;
import java.util.List;

/**
 *
 * @author Jure
 */
public class ObradaVrstaKontakta extends Obrada<VrstaKontakta> {

    @Override
    public List<VrstaKontakta> read() {

        return session.createQuery("from VrstaKontakta").list();
         
    }
    
    
} 
