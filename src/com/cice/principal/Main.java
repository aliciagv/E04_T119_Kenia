/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;


import com.cice.business.VisitableSi;
import com.cice.dto.ParqueNacional;
import com.cice.dto.ReservasCaza;
import com.cice.utils.TipoArma;
import java.util.ArrayList;
import com.cice.business.Visitable;
import com.cice.business.VisitableNo;
import com.cice.dto.AreaProtegidaAcuatica;
import com.cice.dto.AreaProtegidaTerrestre;
import com.cice.dto.AreasProtegida;
import com.cice.utils.TipoTerreno;

/**
 *
 * @author cice
 */
public class Main {
    
   private static ArrayList<ParqueNacional> listaparques = new ArrayList<ParqueNacional>();
    
    public static void main(String[] args){
        
        incluirDatos();
       
        
    
   
    
    }
    
    public static void incluirDatos(){
    
        ReservasCaza rc1 =new ReservasCaza(7.5,TipoArma.ESCOPETA,new VisitableSi(),8500,7,"ReservaCaza1");
         ReservasCaza rc2 =new ReservasCaza(10,TipoArma.PIEDRA,new VisitableNo(),8500,7,"ReservaCaza1");

        listaparques.add(rc1);
        listaparques.add(rc2);
        
        AreasProtegida ap1= new AreasProtegida(2300,"ONG1",null,4200,7,"AreaProtegida");
        AreaProtegidaAcuatica apa = new AreaProtegidaAcuatica (6,2300,"ONG2",null,2000,10,"AreaProtegidaAcuatica");
        AreaProtegidaTerrestre apt =new AreaProtegidaTerrestre(TipoTerreno.SECO,2300,"ONG2",null,2000,10,"AreaProtegidaTerrestre");
        
        listaparques.add(ap1);
        listaparques.add(apa);
        listaparques.add(apt);
    }
    
    
}
