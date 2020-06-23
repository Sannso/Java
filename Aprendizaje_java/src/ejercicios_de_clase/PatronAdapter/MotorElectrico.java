/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronAdapter;

/**
 *
 * @author Santiago
 */
public class MotorElectrico {
    
    private boolean conectado;
    
    public MotorElectrico(){
        System.out.println("Creando motor Electrico...");
        this.conectado = false;
    }
    
    public void conectar(){
        System.out.println("Conectando motor electrico...");
        this.conectado = true;
    }
    
    public void activado(){
        if(!this.conectado){
            System.out.println("No se puede activar porque no esta"
                    + " conectado el motor Electrico...");
        }
        else{
            System.out.println("Activando motor Electrico...");
        }
    }
    
    public void moveFaster(){
        if(!this.conectado){
            System.out.println("No se puede mover mas rapido porque no esta"
                    + " conectado el motor Electrico...");
        }
        else{
            System.out.println("Acelerando,"
                    + " aumentando el voltaje del motor Electrico...");
        }
    }
    
    public void detener(){
        if(!this.conectado){
            System.out.println("No se puede detener el motor Electrico"
                    + " porque no esta conectado...");
        }
        else{
            System.out.println("Deteniendo el motor Electrico...");
        }
    }
    
    public void desconectar(){
        System.out.println("Desconectando motor Electrico");
        this.conectado = false;
    }
}
