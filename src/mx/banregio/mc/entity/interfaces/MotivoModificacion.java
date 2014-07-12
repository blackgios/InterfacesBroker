/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.banregio.mc.entity.interfaces;

import java.io.Serializable;

/**
 *
 * @author Hector Rodriguez
 */
public interface MotivoModificacion extends Serializable{
    
    char getClaveCNV();

    char getClaveModificacion();

    String getDescripcion();

    void setClaveCNV(char claveCNV);

    void setClaveModificacion(Character claveModificacion);

    void setDescripcion(String descripcion);
}
