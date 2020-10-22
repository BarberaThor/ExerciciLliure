/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;


/**
 *
 * precio, descripcion, nombre, id
 * 
 * @author jbarb
 */
public abstract class Item{
    
    private String nombre;
    private String descripcion;
    private double precio;

    public Item(String nombre, String descripcion, double precio) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
    
}