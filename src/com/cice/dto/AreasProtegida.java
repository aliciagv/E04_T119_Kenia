/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.business.Visitable;

/**
 *
 * @author Alicia
 */
public class AreasProtegida extends ParqueNacional {

    private double subvencion;
    private String ONG;

    public AreasProtegida(double subvencion, String ONG, Visitable visitable, double extension, int numespecies, String nombre) {
        super(visitable, extension, numespecies, nombre);
        this.subvencion = subvencion;
        this.ONG = ONG;
    }

   

    
    
    public double getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(double subvencion) {
        this.subvencion = subvencion;
    }

    public String getONG() {
        return ONG;
    }

    public void setONG(String ONG) {
        this.ONG = ONG;
    }
    
    
    @Override
    public void abrirParque() {
        System.out.println("Abriendo Area Protegida: " + this.getNombre());
    }
    
}
