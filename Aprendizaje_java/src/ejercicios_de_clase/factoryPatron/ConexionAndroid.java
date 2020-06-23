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
public class ConexionAndroid implements AConexion{

    @Override
    public void actualizar() {
        System.out.println("Actualizando Android.....");
        System.out.println("Android Actualizado!");
    }
    
}
