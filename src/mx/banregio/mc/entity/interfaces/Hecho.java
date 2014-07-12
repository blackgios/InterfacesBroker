/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.banregio.mc.entity.interfaces;

import java.util.Date;
import mx.banregio.mc.entity.detalles.EstatusHechoDetalle;

/**
 *
 * @author Hector Rodriguez
 */
public interface Hecho {
    
    public boolean isObligacion();

    Broker getBroker();

    long getCantidad();

    long getCantidadAsignada();

    int getClaveOperacion();

    String getCupon();

    String getEmisora();

    EstatusHechoDetalle getEstatusHecho();

    char getEstatusLote();

    Date getFechaCaptura();

    Date getFechaValor();

    String getFolioCasaDeBolsa();

   // Long getFolioCb();

    Long getFolioHecho();

    Long getFolioSentra();

    Date getHoraCaptura();

    Date getHoraHecho();

    double getPrecio();

    String getSerie();

    int getSubfolio();
    
    //char getTipoHecho();

    char getTipoOrden();

    String getTipoValor();

    String getUsuarioCapturo();
    
    void setBroker(Broker broker);

    void setCantidad(long cantidad);

    void setCantidadAsignada(long cantidadAsignada);

    void setClaveOperacion(int claveOperacion);

    void setCupon(String cupon);

    void setEmisora(String emisora);

    void setEstatusHecho(EstatusHechoDetalle estatusHecho);

    void setEstatusLote(char estatusLote);

    void setFechaCaptura(Date fechaCaptura);

    void setFechaValor(Date fechaValor);

    void setFolioCasaDeBolsa(String folioCasaDeBolsa);

    //void setFolioCb(Long folioCb);

    void setFolioHecho(Long folioHecho);

    void setFolioSentra(Long folioSentra);

    void setHoraCaptura(Date horaCaptura);

    void setHoraHecho(Date horaHecho);

    void setPrecio(double precio);

    void setSerie(String serie);

    void setSubfolio(int subfolio);

    //void setTipoHecho(char tipoHecho);

    void setTipoOrden(char tipoOrden);

    void setTipoValor(String tipoValor);

    void setUsuarioCapturo(String usuarioCapturo);
    
    public String getContraparte();
    
    public void setContraparte(String contraparte);
}
