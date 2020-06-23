/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.factoryPatron;

/**
 *
 * @author Santiago
 */
public class main {
    public static void main(String[] args){
        Fabrica f = new Fabrica();
        AConexion producto = f.GetConexion("Android");
        producto.actualizar();
        
        System.out.println("\n");
        
        AConexion producto2 = f.GetConexion("IOs");
        producto2.actualizar();
        
        System.out.println("\n");
        
        AConexion producto3 = f.GetConexion("Otro");
        producto3.actualizar();
    }
}
