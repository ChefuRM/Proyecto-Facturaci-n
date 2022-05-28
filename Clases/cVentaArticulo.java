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
public class cVentaArticulo implements Serializable {

    public String getCodigoArticulo() {
        return CodigoArticulo;
    }

    public void setCodigoArticulo(String CodigoArticulo) {
        this.CodigoArticulo = CodigoArticulo;
    }

    public String getDescripcionA() {
        return DescripcionA;
    }

    public void setDescripcionA(String DescripcionA) {
        this.DescripcionA = DescripcionA;
    }

    public Float getPrecioUnit() {
        return PrecioUnit;
    }

    public void setPrecioUnit(Float PrecioUnit) {
        this.PrecioUnit = PrecioUnit;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getNombreArticulo() {
        return NombreArticulo;
    }

    public void setNombreArticulo(String NombreArticulo) {
        this.NombreArticulo = NombreArticulo;
    }
    private String CodigoArticulo;
    private String DescripcionA;
    private Float PrecioUnit;
    private Integer Cantidad;
    private String NombreArticulo;
}
