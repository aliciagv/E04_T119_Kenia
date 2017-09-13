/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.business.Visitable;
import com.cice.utils.TipoTerreno;

/**
 *
 * @author Alicia
 */
public class AreaProtegidaTerrestre extends AreasProtegida{
    private TipoTerreno tterreno;

    public AreaProtegidaTerrestre(TipoTerreno tterreno, double subvencion, String ONG, Visitable visitable, double extension, int numespecies, String nombre) {
        super(subvencion, ONG, visitable, extension, numespecies, nombre);
        this.tterreno = tterreno;
    }

    public TipoTerreno getTterreno() {
        return tterreno;
    }

    public void setTterreno(TipoTerreno tterreno) {
        this.tterreno = tterreno;
    }
    
    
    
}
