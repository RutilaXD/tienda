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
public class Venta {

    private Date fecha;
    private ArrayList<Producto> p;
    private ArrayList<ProductoPerecedero> pp;
    private Vendedor vendedor;
    private int cantidad;
    private float apagar;

    public Venta(Date fecha, ArrayList<Producto> p, ArrayList<ProductoPerecedero> pp, Vendedor vendedor) {
        this.fecha = fecha;
        this.p = p;
        this.pp = pp;
        this.vendedor = vendedor;
        if (!p.isEmpty()) {
            cantidad = p.size();
            for (int i = 0; i < cantidad; i++) {
                apagar += p.get(i).getPrecio();
            }
        }
        if (!pp.isEmpty()) {
            cantidad = pp.size();
            for (int i = 0; i < cantidad; i++) {
                apagar += pp.get(i).getPrecio();
            }
        }
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the apagar
     */
    public float getApagar() {
        return apagar;
    }
    
    public void imprimirVendedor(){
        System.out.println("Vendedor: ");
        System.out.println("\n\tID del vendedor: "+vendedor.getIdVendedor());
        System.out.println("\n\tNombre: "+vendedor.getNombre());
        System.out.println("\n\tRFC: "+vendedor.getRfc());
    }
    
    public void imprimirProd(){
        if(!p.isEmpty()){
            for(int i = 0; i < p.size(); i++){
                System.out.println("");
            }
        }
    }
}
