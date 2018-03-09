/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Raul
 */
public class Reporte {
    private String noReporte;
    private Date fechaRep;
    ArrayList<Venta> ventas;

    public Reporte(String noReporte, Date fechaRep) {
        this.noReporte = noReporte;
        this.fechaRep = fechaRep;
    }
    
    /**
     * Método que imprime el reporte generado
     */
    private void reporte(){
        if(!ventas.isEmpty()){
            System.out.println("# Reporte: "+noReporte);
            System.out.println("Fecha de reporte: "+fechaRep);
            System.out.println("Ventas realizadas: ");
            for (Venta venta : ventas) {
                System.out.println("Fecha de venta: " + venta.getFecha());
                venta.imprimirVendedor();
                venta.imprimirProdVendido();
            }
        }else
            System.out.print("No se encontraron ventas en esa fecha");
    }
    
    /**
     * Método que crea reporte por fecha de venta
     * @param fechaventa 
     * @param totalVentas 
     */
    public void reportBySellDate(Date fechaventa, ArrayList<Venta> totalVentas){
        if(!totalVentas.isEmpty()){
            for (Venta totalVenta : totalVentas) {
                if (totalVenta.getFecha() == fechaventa) {
                    ventas.add(totalVenta);
                }
            }
        }
        reporte();
    }
    /**
     * Método que crea reporte por producto no perecedero
     * @param p
     * @param totalVentas 
     */
    public void reportByProduct(String p, ArrayList<Venta> totalVentas){
        if(!totalVentas.isEmpty()){
            ArrayList<Producto> prod;
            
            for (Venta totalVenta : totalVentas) {
                prod = totalVenta.getP();
                for(Producto product : prod){
                   if(product.getProduct().equalsIgnoreCase(p)){
                       ventas.add(totalVenta);
                   }
                }                
            }
        }
        reporte();        
    }
    /**
     * Método que crea reporte por producto perecedero
     * @param p 
     * @param totalVentas 
     */
    public void reportByProductp(String p, ArrayList<Venta> totalVentas){
        if(!totalVentas.isEmpty()){
            ArrayList<Perecedero> pp;
            
            for (Venta totalVenta : totalVentas) {
                pp = totalVenta.getPp();
                for(Perecedero product : pp){
                   if(product.getProduct().equalsIgnoreCase(p)){
                       ventas.add(totalVenta);
                   }
                }                
            }
        }
        reporte();        
    }
    
    public void reportByVendor(String rfc, ArrayList<Venta> totalVentas){
        if(!totalVentas.isEmpty()){            
            for (Venta totalVenta : totalVentas) {
               if(totalVenta.getVendedor().getRfc().equals(rfc)){
                   ventas.add(totalVenta);
               }
            }
         }
        reporte();
    }

    /**
     * @return the noReporte
     */
    public String getNoReporte() {
        return noReporte;
    }

    /**
     * @return the fechaRep
     */
    public Date getFechaRep() {
        return fechaRep;
    }
}
