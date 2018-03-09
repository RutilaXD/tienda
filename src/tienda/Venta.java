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
    private ArrayList<Perecedero> pp;
    private Vendedor vendedor;
    private int cantidad;
    private float apagar;

    public Venta(Date fecha, ArrayList<Producto> p, ArrayList<Perecedero> pp, Vendedor vendedor) {
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
        System.out.println("\n\tID del vendedor: "+getVendedor().getIdVendedor());
        System.out.println("\n\tNombre: "+getVendedor().getNombre());
        System.out.println("\n\tRFC: "+getVendedor().getRfc());
    }
    
    public void imprimirProdVendido(){
        if(!p.isEmpty()){
            System.out.println("Productos no perecederos vendidos:");
            for(int i = 0; i < getP().size(); i++){
                System.out.println("\nCodigo: "+getP().get(i).getCodigo());
                System.out.println("\nProducto: "+getP().get(i).getProduct());
                System.out.println("\nPrecio: "+getP().get(i).getPrecio());
            }
        }
        if(!pp.isEmpty()){
            System.out.println("Productos perecederos vendidos: ");
            for (int i = 0; i < getPp().size(); i++) {
                System.out.println("\nProducto: "+getPp().get(i).getProduct());
                System.out.println("\nCaducidad: "+getPp().get(i).getCaducidad());
                System.out.println("\nPrecio: "+getPp().get(i).getPrecio());
            }
        }
        System.out.println("Total a pagar: "+apagar);
    }

    /**
     * @return the p
     */
    public ArrayList<Producto> getP() {
        return p;
    }

    /**
     * @return the pp
     */
    public ArrayList<Perecedero> getPp() {
        return pp;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }
}
