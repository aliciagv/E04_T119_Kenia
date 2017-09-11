/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.business.CreadorVisitable;
import com.cice.business.EstrategiaVisitable;

/**
 *
 * @author cice
 */
public abstract class ParqueNacional {
    
    private EstrategiaVisitable visitable;
    private double extension;
    private int numespecies;
    private String nombre;

    public EstrategiaVisitable getVisitable() {
        return visitable;
    }

    public void setVisitable(EstrategiaVisitable visitable) {
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
        System.out.println("El ");
        if (visitable!=null) {
            CreadorVisitable cv = new CreadorVisitable(visitable);
            cv.asignarVisitable();
        
        }
        
    }
    public abstract void abrirParque();
    
    
    
    
}
