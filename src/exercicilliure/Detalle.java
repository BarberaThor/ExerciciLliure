/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;

/**
 * id, cantidad, item
 * 
 * @author jbarb
 */
public abstract class Detalle extends CestaDeLaCompra {
    
    protected String id;
    private int cantidad;
    private Item item;

    public Detalle(String id, int cantidad, Item item) {
        this.id = id;
        this.cantidad = cantidad;
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Item getItem() {
        return item;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id=" + id + ", cantidad=" + cantidad + ", item=" + item + '}';
    }
    
    

    
}
