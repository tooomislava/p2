/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Entitet;
import ffos.kolokvij0.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jure
 */
public abstract class Obrada<T> {
    
    protected Session session;

    public Obrada() {
        session=HibernateUtil.getSession();
    }
    
    public abstract List<T> read();
    
    // CRUD
    
    public void create(T e){
        save(e);
    }
    
    public void update(T e){
        save(e);
    }
    
    private void save(T e){
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }
    
    public void delete(T e){
        session.beginTransaction();
        session.delete(e);
        session.getTransaction().commit();
    }
    
    
    
}