/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class Proveedor {
    private String empresa;
    private String telefono;
    private ArrayList<Producto> lstP;

    public Proveedor(String empresa, String telefono, ArrayList<Producto> lstP) {
        this.empresa = empresa;
        this.telefono = telefono;
        this.lstP = lstP;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the lstP
     */
    public ArrayList<Producto> getLstP() {
        return lstP;
    }

    /**
     * @param lstP the lstP to set
     */
    public void setLstP(ArrayList<Producto> lstP) {
        this.lstP = lstP;
    }
}
