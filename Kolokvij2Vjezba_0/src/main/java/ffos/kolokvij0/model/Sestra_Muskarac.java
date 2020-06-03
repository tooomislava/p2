/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jure
 */
@Entity
public abstract class Sestra_Muskarac extends Entitet{
    
    @ManyToOne
    private Muskarac muskarac;

 

    @ManyToOne
    private Sestra sestra;

    
    
}
