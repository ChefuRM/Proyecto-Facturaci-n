package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Chefu
 */
public class cFactura implements Serializable {

    /**
     * @return the cliente
     */
    public cCliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(cCliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the empleado
     */
    public cEmpleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(cEmpleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the ventas
     */
    public ArrayList<cVentaArticulo> getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(ArrayList<cVentaArticulo> ventas) {
        this.ventas = ventas;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the totalIva
     */
    public String getTotalIva() {
        return totalIva;
    }

    /**
     * @param totalIva the totalIva to set
     */
    public void setTotalIva(String totalIva) {
        this.totalIva = totalIva;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the correlativo
     */
    public String getCorrelativo() {
        return correlativo;
    }

    /**
     * @param correlativo the correlativo to set
     */
    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private cCliente cliente;
    private cEmpleado empleado;
    private ArrayList<cVentaArticulo> ventas = new ArrayList<cVentaArticulo>();
    private String total;
    private String totalIva;
    private String fecha;
    private String correlativo;
    private String estado;
}
