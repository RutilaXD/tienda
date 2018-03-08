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
public class ProveedorPerecedero {
    private String nombreP;
    private String local;
    private String tel;
    private String encargado;
    private ProductoPerecedero perecedero;

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
     * @return the perecedero
     */
    public ProductoPerecedero getPerecedero() {
        return perecedero;
    }

    /**
     * @param perecedero the perecedero to set
     */
    public void setPerecedero(ProductoPerecedero perecedero) {
        this.perecedero = perecedero;
    }
}
