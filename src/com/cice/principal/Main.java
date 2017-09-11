/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;


import com.cice.business.CreadorVisitable;
import com.cice.business.EstrategiaVisitable;
import com.cice.business.VisitableSi;
import com.cice.dto.ParqueNacional;
import com.cice.dto.ReservasCaza;
import com.cice.utils.TipoArma;
import java.util.ArrayList;

/**
 *
 * @author cice
 */
public class Main {
    
    
    public static void main(String[] args){
        
        ArrayList<ParqueNacional> listaparques = new ArrayList<ParqueNacional>();
        ReservasCaza rc1 =new ReservasCaza(7.5,TipoArma.ESCOPETA);
        EstrategiaVisitable ev = new VisitableSi();
        rc1.setVisitable(ev);
        
        
        //rc1.
        listaparques.add(new ReservasCaza(7.5,TipoArma.ESCOPETA));
    
    //EstrategiaVisitable estrategiaVisibleSI = new VisitableSi();
    
    }
    
    
}
