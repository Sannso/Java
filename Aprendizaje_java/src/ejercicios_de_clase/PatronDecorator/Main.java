/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronDecorator;

/**
 *
 * @author Santiago
 */
public class Main {
    public static void main(String[] args) {
        AgenciaViajes via = new AgenciaViajes("NombreCliente");
        
        Viaje v = new ViajeBasico();
        
        // Implementacion de como deberia ir la decoracion pero esto no da a cabia a mas de 1
        // (Obvie la implementacion singular de desayuno y buffet porque ya se muestran en la otra)
        Viaje vDecorado = new ComidaDecorator(v); 
        vDecorado.inscribirViaje(via);
        
        
        // Por la tanto implemente esta otra que permite agregar cuantas quiera
        FoodDecorador vDecoradomio = new FoodDecorador(v);
        vDecoradomio.setDesayunoDecorator();
        vDecoradomio.setBuffetDecorator();
        vDecoradomio.inscribirViaje(via);
   
    }
}
