/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.utils;

/**
 *
 * @author Alicia
 */
public enum TipoTerreno {
    HUMEDO("Humedo"),
    SECO("Seco");
           
    private String tterreno;

    private TipoTerreno(String tterreno){
        this.tterreno=tterreno;
    }
    public String getTterreno() {
        return tterreno;
    }
    
    
    
}
