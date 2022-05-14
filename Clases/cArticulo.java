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
public class cArticulo implements Serializable {
    /**
     * @return the CodigoArticulo
     */
    public String getCodigoArticulo() {
        return CodigoArticulo;
    }

    /**
     * @param CodigoArticulo the CodigoArticulo to set
     */
    public void setCodigoArticulo(String CodigoArticulo) {
        this.CodigoArticulo = CodigoArticulo;
    }

    /**
     * @return the DescripcionA
     */
    public String getDescripcionA() {
        return DescripcionA;
    }

    /**
     * @param DescripcionA the DescripcionA to set
     */
    public void setDescripcionA(String DescripcionA) {
        this.DescripcionA = DescripcionA;
    }

    /**
     * @return the PrecioUnit
     */
    public String getPrecioUnit() {
        return PrecioUnit;
    }

    /**
     * @param PrecioUnit the PrecioUnit to set
     */
    public void setPrecioUnit(String PrecioUnit) {
        this.PrecioUnit = PrecioUnit;
    }

    /**
     * @return the Cantidad
     */
    public String getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public cProveedor getCodigoProveedor() {
        return CodigoProveedor;
    }

    public void setCodigoProveedor(cProveedor CodigoProveedor) {
        this.CodigoProveedor = CodigoProveedor;
    }
    private cProveedor CodigoProveedor;
    private String CodigoArticulo;
    private String DescripcionA;
    private String PrecioUnit;
    private String Cantidad;
}
