/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * 
 * @author Santiago Martinez Diaz
 */
public class Devolucion {
    
    private String Codigo_Devolucion;
    private String Codigo_Renta;
    private String Fecha_Devolucion;

    public Devolucion() {
    }

    public Devolucion(String Codigo_Devolucion, String Codigo_Renta, String Fecha_Devolucion) {
        this.Codigo_Devolucion = Codigo_Devolucion;
        this.Codigo_Renta = Codigo_Renta;
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public String getCodigo_Devolucion() {
        return Codigo_Devolucion;
    }

    public void setCodigo_Devolucion(String Codigo_Devolucion) {
        this.Codigo_Devolucion = Codigo_Devolucion;
    }

    public String getCodigo_Renta() {
        return Codigo_Renta;
    }

    public void setCodigo_Renta(String Codigo_Renta) {
        this.Codigo_Renta = Codigo_Renta;
    }

    public String getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(String Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    @Override
    public String toString() {
        return "Devolucion{" + "Codigo_Devolucion=" + Codigo_Devolucion + ", Codigo_Renta=" + Codigo_Renta + ", Fecha_Devolucion=" + Fecha_Devolucion + '}';
    }
    
    
}
