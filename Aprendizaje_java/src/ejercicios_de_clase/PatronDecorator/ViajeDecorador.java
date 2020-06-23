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
public abstract class ViajeDecorador implements Viaje{
    protected Viaje viajeDecorado;
    
    public ViajeDecorador(Viaje viaje){
        this.viajeDecorado = viaje;
    }
    
    @Override
    public void inscribirViaje(AgenciaViajes agenciaViajes){
        this.viajeDecorado.inscribirViaje(agenciaViajes);
    }
}
