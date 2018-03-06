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
public class Vendedor {
    private String idVendedor;
    private String nombre;
    private String rfc;

    public Vendedor(String idVendedor, String nombre, String rfc) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.rfc = rfc;
    }

    
    /**
     * @return the idVendedor
     */
    public String getIdVendedor() {
        return idVendedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }
}
