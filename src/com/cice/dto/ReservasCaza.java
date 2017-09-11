/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.utils.TipoArma;

/**
 *
 * @author cice
 */
public class ReservasCaza extends ParqueNacional {

    private double costeLicencia;
    private TipoArma arma;

    public ReservasCaza(double costeLicencia, TipoArma arma) {
        this.costeLicencia = costeLicencia;
        this.arma = arma;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public TipoArma getArma() {
        return arma;
    }

    public void setArma(TipoArma arma) {
        this.arma = arma;
    }

    @Override
    public void abrirParque() {
        System.out.println("La Reserva de Caza " + getNombre() + "está abierto");
    }

}
