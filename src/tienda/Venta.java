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
     * @return the p
     */
    public ArrayList<Producto> getP() {
        return p;
    }

    /**
     * @return the pp
     */
    public ArrayList<ProductoPerecedero> getPp() {
        return pp;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
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
}
