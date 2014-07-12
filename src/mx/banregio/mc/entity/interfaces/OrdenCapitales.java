/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.banregio.mc.entity.interfaces;

import java.util.Date;
import mx.banregio.mc.entity.detalles.EstatusOrdenDetalle;

/**
 *
 * @author Hector Rodriguez
 */
public interface OrdenCapitales {
    
    public int getClaveOperacion();

    public Emision getEmision();

    public Date getFechaVigencia();
    
    public Date getHoraCaptura();
    
    public String getFolioBroker();
    
    public Date getFecHoraCaptura();
    
    public Date getHoraSolicitud();
    
    public long getVolumenOculto();
    
    public Long getNumeroOrden();
    
    public double getPrecio();
    
    public int getVigencia();

    public long getCantidad();
           
    public double getNivelPrecio();
    
    public double getPorCantidadVolumenOculto();
    
    public Date getFechaCancelacion();
    
    public void setCantidadAsignada(long cantidadAsignada);

    public void setComision(double comision);

    public void setEstatusOrdenCapitales(EstatusOrdenDetalle ASIGNADA);

    public void setImporteNeto(double importeNeto);

    public void setIva(double iva);

    public void setPrecioCierre(double precio);
    
    public TipoModalidad getTipoModalidad();
    
    public String getNumeroContrato();
}
