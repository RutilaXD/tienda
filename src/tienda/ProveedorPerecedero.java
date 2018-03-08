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
public class ProveedorPerecedero {
    private String nombreP;
    private String local;
    private String tel;
    private String encargado;
    private ArrayList<ProductoPerecedero> lstPP;

    public ProveedorPerecedero(String nombreP, String local, String tel, String encargado, ArrayList<ProductoPerecedero> lstPP) {
        this.nombreP = nombreP;
        this.local = local;
        this.tel = tel;
        this.encargado = encargado;
        this.lstPP = lstPP;
    }

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the encargado
     */
    public String getEncargado() {
        return encargado;
    }

    /**
     * @param encargado the encargado to set
     */
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    /**
     * @return the lstPP
     */
    public ArrayList<ProductoPerecedero> getLstPP() {
        return lstPP;
    }

    /**
     * @param lstPP the lstPP to set
     */
    public void setLstPP(ArrayList<ProductoPerecedero> lstPP) {
        this.lstPP = lstPP;
    }
}
