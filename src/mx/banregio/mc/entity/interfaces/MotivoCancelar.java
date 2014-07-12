/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.banregio.mc.entity.interfaces;

import mx.banregio.mc.entity.detalles.FaseCancelacionDetalle;

/**
 *
 * @author Hector Rodriguez
 */
public interface MotivoCancelar {
    
    char getClaveCNV();

    char getClaveCancelacion();

    String getDescripcion();

    FaseCancelacionDetalle getEstatusDeCancelacion();

    boolean getVieneDeBolsa();

    void setClaveCNV(char claveCNV);

    void setClaveCancelacion(Character claveCancelacion);

    void setDescripcion(String descripcion);

    void setEstatusDeCancelacion(FaseCancelacionDetalle estatusDeCancelacion);

    void setVieneDeBolsa(boolean vieneDeBolsa);
}
