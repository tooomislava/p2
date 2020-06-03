/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Muskarac;
import ffos.kolokvij0.model.Sestra;
import java.util.List;

/**
 *
 * @author Jure
 */
public class ObradaSestra extends Obrada<Sestra> {
    
    @Override
    public List<Sestra> read() {
        return session.createQuery("from Sestra").list();
    }
    
}