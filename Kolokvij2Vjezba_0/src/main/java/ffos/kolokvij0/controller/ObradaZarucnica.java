/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Sestra;
import ffos.kolokvij0.model.Zarucnica;
import java.util.List;

/**
 *
 * @author Jure
 */
public class ObradaZarucnica extends Obrada<Zarucnica> {
    
    @Override
    public List<Zarucnica> read() {
        return session.createQuery("from Zarucnica").list();
    }
    
}