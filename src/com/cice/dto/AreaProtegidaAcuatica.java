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
public class AreaProtegidaAcuatica extends AreasProtegida {
    private int numlagos;

    public AreaProtegidaAcuatica(int numlagos, double subvencion, String ONG, Visitable visitable, double extension, int numespecies, String nombre) {
        super(subvencion, ONG, visitable, extension, numespecies, nombre);
        this.numlagos = numlagos;
    }

    public int getNumlagos() {
        return numlagos;
    }

    public void setNumlagos(int numlagos) {
        this.numlagos = numlagos;
    }
    
    
}
