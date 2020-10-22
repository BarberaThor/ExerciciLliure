/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;

import java.util.ArrayList;

/**
 *
 * Implementa un ejercicio original con:
 * 
 * Herencia 
 * 
 * Polimorfismo
 * 
 * Interfaces
 * 
 * @author jbarb
 */
public abstract class CestaDeLaCompra implements Finalizable {

    private ArrayList<Detalle> cesta = new ArrayList<>();

    public void añade(Detalle detalle){
        
        cesta.add(detalle);       
    }
    
    public Boolean elimina(Detalle detalle){
        for (int i = 0; i < cesta.size(); i++)
        {
            if (cesta.get(i).getId().equals(detalle.id)) {
                cesta.remove(i);
                return true;
                //S'ha eliminat el detall
            }
        }
        return false;
        //No s'ha trobat el detall en la cesta
    }
    
    @Override
    public double checkout() {
        double total = 0;
        int quantitat;
        double preu;
        
        
        for(int i = 0; i < cesta.size(); i++)
        {
            
            quantitat =  cesta.get(i).getCantidad();
            preu = cesta.get(i).getItem().getPrecio();
        
            total = total + (quantitat * preu);

            System.out.println(cesta.get(i).toString());
        }
       
            
        return total;
    }

    

}