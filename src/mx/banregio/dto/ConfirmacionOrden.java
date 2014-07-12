/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.banregio.dto;

import java.util.Date;

/**
 *
 * @author Hector Rodriguez
 */
public class ConfirmacionOrden {
    private Long folioBanregio;
    private Long folioCasaDeBolsa;
    private boolean confirmada;
    private Date fechaBroker;

    public Long getFolioBanregio() {
        return folioBanregio;
    }

    public void setFolioBanregio(Long folioBanregio) {
        this.folioBanregio = folioBanregio;
    }

    public Long getFolioCasaDeBolsa() {
        return folioCasaDeBolsa;
    }

    public void setFolioCasaDeBolsa(Long folioCasaDeBolsa) {
        this.folioCasaDeBolsa = folioCasaDeBolsa;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public Date getFechaBroker() {
        return fechaBroker;
    }

    public void setFechaBroker(Date fechaBroker) {
        this.fechaBroker = fechaBroker;
    }
    
}
