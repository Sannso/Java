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
public class MotorComun extends Motor{
    
    public MotorComun(){
        System.out.println("Creando motor comun...");
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo motor comun...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor comun...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor comun...");
    }
    
}
