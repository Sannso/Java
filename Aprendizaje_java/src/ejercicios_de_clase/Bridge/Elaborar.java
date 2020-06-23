/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.Bridge;

/**
 *
 * @author Santiago
 */
public class Elaborar implements Implementacion{

    @Override
    public void crearVehiculo() {
        System.out.println("Se Elaboro el vehiculo");
    }
    
}
