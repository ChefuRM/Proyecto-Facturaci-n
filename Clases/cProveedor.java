/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Chefu
 */
public class cProveedor implements Serializable {

    public String getCodigoProveedorP() {
        return CodigoProveedorP;
    }

    public void setCodigoProveedorP(String CodigoProveedorP) {
        this.CodigoProveedorP = CodigoProveedorP;
    }

    public String getNitProveedor() {
        return NitProveedor;
    }

    public void setNitProveedor(String NitProveedor) {
        this.NitProveedor = NitProveedor;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    public String getDireccionProveedor() {
        return DireccionProveedor;
    }

    public void setDireccionProveedor(String DireccionProveedor) {
        this.DireccionProveedor = DireccionProveedor;
    }

    public String getCelularProveedor() {
        return CelularProveedor;
    }

    public void setCelularProveedor(String CelularProveedor) {
        this.CelularProveedor = CelularProveedor;
    }
    private String CodigoProveedorP;
    private String NitProveedor;
    private String NombreProveedor;
    private String DireccionProveedor;
    private String CelularProveedor;
}
