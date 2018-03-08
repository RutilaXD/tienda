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

    public ProductoPerecedero(String product, Date caducidad, Date compra, int diasAlmacen) {
        this.product = product;
        this.caducidad = caducidad;
        this.compra = compra;
        this.diasAlmacen = diasAlmacen;
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
}
