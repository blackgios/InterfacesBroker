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
public interface Broker extends Serializable{
    
    String getClave();
    
    //Integer getClaveTipoPortafolio();
    
    double getComision();
    
    boolean getConexionDirecta();
    
    boolean getConexionManual();
    
    String getDescripcion();
    
    boolean getExportarArchivo();
    
    String getManejador();
    
    String getNombre();
    
    boolean getPatron();
    
    void setClave(String clave);
    
    // void setClaveTipoPortafolio(Integer claveTipoPortafolio);
    
    void setComision(double comision);
    
    void setConexionDirecta(boolean conexionDirecta);
    
    void setConexionManual(boolean conexionManual);
    
    void setDescripcion(String descripcion);
    
    void setExportarArchivo(boolean exportarArchivo);
    
    void setManejador(String manejador);

    void setNombre(String nombre);

    void setPatron(boolean patron);
    
}
