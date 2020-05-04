/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdeprogramación;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saaku
 */
public class OrdenDeCompra {
        private Date fechaCompra;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Producto> productos;
    private double totalCompra;

    public OrdenDeCompra() {}

    public OrdenDeCompra(Date fechaCompra, Cliente cliente, Vendedor vendedor, ArrayList<Producto> productos) {
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.productos = productos;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    
    public double totalCompra(){
        for (int i = 0; i < productos.size(); i++) {
            totalCompra = totalCompra + productos.get(i).getPrecioUnitario();
        }
        return totalCompra;
    }

}
