/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronDecorator;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class FoodDecorador extends ViajeDecorador{
    
    private ArrayList<String> whoDecorator = new ArrayList<>();
    //private String whoDecorator = "None";
    
    public FoodDecorador(Viaje viaje) {
        super(viaje);
    }
    
    @Override
    public void inscribirViaje(AgenciaViajes agenciaViajes){
        viajeDecorado.inscribirViaje(agenciaViajes);
        addDecorator(agenciaViajes);
    }
    
    public void setDesayunoDecorator(){
        whoDecorator.add("Desayuno");
    }
    
    public void setAlmuerzoDecorator(){
        whoDecorator.add("Almuerzo");
    }
    
    public void setComidaDecorator(){
        whoDecorator.add("Comida");
    }
    
    public void setBuffetDecorator(){
        whoDecorator.add("Buffet");
    }
    
    
    private void addDecorator(AgenciaViajes av){
        
        if(!whoDecorator.isEmpty()){
            for(String w : whoDecorator){
                
                if(w.equalsIgnoreCase("Desayuno")){
                    System.out.println("Se agrego el Desayuno al viaje con"
                        + " un valor de 150.000");
                    
                    av.setPrecioViaje((av.getPrecioViaje() + 150000));
                    
                    System.out.println("Precio del viaje actualizado:"
                        + " " + (av.getPrecioViaje()));
                }
                
                if(w.equalsIgnoreCase("Almuerzo")){
                    System.out.println("Se agrego el Almuerzo al viaje con"
                        + " un valor de 200.000");
                    
                    av.setPrecioViaje((av.getPrecioViaje() + 200000));
                    
                    System.out.println("Precio del viaje actualizado:"
                        + " " + (av.getPrecioViaje()));
                }
                
                if(w.equalsIgnoreCase("Comida")){
                    System.out.println("Se agrego el Comida al viaje con"
                        + " un valor de 200.000");
                    
                    av.setPrecioViaje((av.getPrecioViaje() + 200000));
                    
                    System.out.println("Precio del viaje actualizado:"
                        + " " + (av.getPrecioViaje()));
                }
                
                if(w.equalsIgnoreCase("Buffet")){
                    System.out.println("Se agrego el Buffet al viaje con"
                        + " un valor de 500.000");
                    
                    av.setPrecioViaje((av.getPrecioViaje() + 500000));
                    
                    System.out.println("Precio del viaje actualizado:"
                        + " " + (av.getPrecioViaje()));
                }
                
            }
        }
        
        
        
    }
    
}
