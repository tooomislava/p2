/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Cura;
import java.util.List;

/**
 *
 * @author Jure
 */
public class ObradaCura extends Obrada<Cura> {
    
    @Override
    public List<Cura> read() {
        return session.createQuery("from Cura").list();
    }
    
}