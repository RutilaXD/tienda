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
public class Producto {
    private String codigo;
    private String product;
    private float precio;

    public Producto(String codigo, String product, float precio) {
        this.codigo = codigo;
        this.product = product;
        this.precio = precio;
    }

   
    /**
     * @return the product
     */
    public String getProduct() {
        return product;
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

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }
}
