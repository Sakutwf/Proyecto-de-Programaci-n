/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdeprogramación;

/**
 *
 * @author Saaku
 */
public class Producto {
    private String nombre;
    private String id;
    private double precioUnitario;

    public Producto() {}
   
    public Producto(String nombre, String id, double precioUnitario) {
        this.nombre = nombre;
        this.id = id;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
