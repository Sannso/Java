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
public class ViajeVip implements Viaje{

    @Override
    public void inscribirViaje(AgenciaViajes agenciaViajes) {
        System.out.println("-------------------------");
        System.out.println("Viaje VIP inscrito correctamente!!");
        System.out.println("Cliente: " + agenciaViajes.getClient());
        agenciaViajes.setPrecioViaje(2000000);
        System.out.println("Precio del viaje: " + agenciaViajes.getPrecioViaje());
    }
    
}
