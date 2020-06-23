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
public class AlmuerzoDecorator extends ViajeDecorador{
    
    public AlmuerzoDecorator(Viaje viaje) {
        super(viaje);
    }
    
    @Override
    public void inscribirViaje(AgenciaViajes agenciaViajes){
        viajeDecorado.inscribirViaje(agenciaViajes);
        addDecorator(agenciaViajes);
    }
    
   
    
    
    private void addDecorator(AgenciaViajes av){
        System.out.println("Se agrego el Almuerzo al viaje con"
            + " un valor de 200.000");

        av.setPrecioViaje((av.getPrecioViaje() + 200000));

        System.out.println("Precio del viaje actualizado:"
            + " " + (av.getPrecioViaje()));
    } 
}
