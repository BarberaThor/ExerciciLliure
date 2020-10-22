/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;

/**
 *
 * @author jbarb
 */
public class ExerciciLliure {

   public static void main(String[] args) {

       double total;
        
        CestaDeLaCompra a = new CestaDeLaCompra() {};
        
        Item arroz = new ItemAliment("Paquete Arroz", "200 gramos de arroz blanco", 10);
        Item ordinador = new ItemElectronic("Ordinador", "De gama mitja", 700);
        
        Detalle detalleArroz = new Detalle("1", 4, arroz) {};
        Detalle detalleOrdinador = new Detalle("2", 2, ordinador) {};
        
        a.añade(detalleArroz);
        a.añade(detalleOrdinador);
   
        total = a.checkout();
        
        //Resultat quan tenim a la cesta els 2 detalls
        System.out.println(total);
        
        a.elimina(detalleOrdinador);
        
        total = a.checkout();
        
        //Resultat quan eliminem de la cesta el detall d'ordinador
        System.out.println(total);
        
        a.elimina(detalleArroz);
        
        total = a.checkout();
        //Resultat 0, ja que em eliminat tots els detalls
        System.out.println(total);
       
    }
    
    
}
