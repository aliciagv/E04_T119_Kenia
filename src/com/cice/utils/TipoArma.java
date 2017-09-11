/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.utils;

/**
 *
 * @author cice
 */
public enum TipoArma {
    
    ESCOPETA("Escopeta"),
    PIEDRA("Piedra"),
    TIRACHINAS("Tirachinas");
    
    private String arma;

    private TipoArma(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }
    
    
    
}
