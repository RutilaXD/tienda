/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Raul
 */
public class Reporte {
    private String noReporte;
    private Venta ventas;

    public Reporte(String noReporte, Venta ventas) {
        this.noReporte = noReporte;
        this.ventas = ventas;
    }

    /**
     * @return the noReporte
     */
    public String getNoReporte() {
        return noReporte;
    }

    /**
     * @return the ventas
     */
    public Venta getVentas() {
        return ventas;
    }
}
