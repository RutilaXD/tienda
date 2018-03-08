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
    
    private void reporte(){
        if(!ventas.isEmpty()){
            System.out.println("# Reporte: "+noReporte);
            System.out.println("Fecha de reporte: "+fechaRep);
            System.out.println("Ventas realizadas: ");
            for(int i = 0; i < ventas.size(); i++){
                System.out.println("Fecha de venta: "+ventas.get(i).getFecha());
                ventas.get(i).imprimirVendedor();
            }
        }else
            System.out.print("No se encontraron ventas en esa fecha");
    }
    
    public void reportBySellDate(Date fechaventa, ArrayList<Venta> todasventas){
        if(!todasventas.isEmpty()){
            for(int i = 0; i < todasventas.size(); i++){
                if(todasventas.get(i).getFecha() == fechaventa){
                    ventas.set(i, todasventas.get(i));
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
