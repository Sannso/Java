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
public class Autobus extends Vehiculo{

    public Autobus(Implementacion im){
        super(im);
    }
    
    @Override
    public void procesar() {
        System.out.println("Procesando Autobus...");
        impl.crearVehiculo();
    }
    
}
