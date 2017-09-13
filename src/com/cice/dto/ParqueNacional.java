/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;
import com.cice.business.Visitable;

/**
 *
 * @author cice
 */
public abstract class ParqueNacional {
    
    private Visitable visitable;
    private double extension;
    private int numespecies;
    private String nombre;

    public ParqueNacional(Visitable visitable, double extension, int numespecies, String nombre) {
        this.visitable = visitable;
        this.extension = extension;
        this.numespecies = numespecies;
        this.nombre = nombre;
    }

    
    
    public Visitable getVisitable() {
        return visitable;
    }

    public void setVisitable(Visitable visitable) {
        this.visitable = visitable;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public int getNumespecies() {
        return numespecies;
    }

    public void setNumespecies(int numespecies) {
        this.numespecies = numespecies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("La extensión es: "+ extension);
        System.out.println("El número de especies es: "+ numespecies);
        if (visitable!=null) {
            visitable.mostrarVisitable();
        
        }
        
    }
    public abstract void abrirParque();
    
    
    
    
}
