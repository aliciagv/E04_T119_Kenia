/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.business;

/**
 *
 * @author cice
 */
public class CreadorVisitable {
    private EstrategiaVisitable estrategiaVisitable;

    public CreadorVisitable(EstrategiaVisitable estrategiaVisitable) {
        this.estrategiaVisitable = estrategiaVisitable;
    }

    public void setEstrategiaVisitable(EstrategiaVisitable estrategiaVisitable) {
        this.estrategiaVisitable = estrategiaVisitable;
    }
    
    public void asignarVisitable(){
        estrategiaVisitable.setVisitable();
}
    
    
    
}
