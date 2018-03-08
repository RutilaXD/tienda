/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Date;

/**
 *
 * @author Raul
 */
public class ProductoPerecedero {
    private String product;
    private Date caducidad;
    private Date compra;
    private int diasAlmacen;
    private float precio;

    public ProductoPerecedero(String product, Date caducidad, Date compra, int diasAlmacen, float precio) {
        this.product = product;
        this.caducidad = caducidad;
        this.compra = compra;
        this.diasAlmacen = diasAlmacen;
        this.precio = precio;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @return the caducidad
     */
    public Date getCaducidad() {
        return caducidad;
    }

    /**
     * @return the compra
     */
    public Date getCompra() {
        return compra;
    }

    /**
     * @return the diasAlmacen
     */
    public int getDiasAlmacen() {
        return diasAlmacen;
    }

    /**
     * @param diasAlmacen the diasAlmacen to set
     */
    public void setDiasAlmacen(int diasAlmacen) {
        this.diasAlmacen = diasAlmacen;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
