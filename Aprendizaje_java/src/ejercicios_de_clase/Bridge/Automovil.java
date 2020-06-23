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
public class Automovil extends Vehiculo{
    
    public Automovil(Implementacion im){
        super(im);
    }
    
    @Override
    public void procesar() {
        System.out.println("Procesando Automovil...");
        impl.crearVehiculo();
    }
    
}
