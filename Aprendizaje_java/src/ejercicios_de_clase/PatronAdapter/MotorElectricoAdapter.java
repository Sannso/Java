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
public class MotorElectricoAdapter extends Motor{
      
    private MotorElectrico motorElectrico;
    
    public MotorElectricoAdapter(){
        System.out.println("Creando adaptador del Motor Electrico...");
        this.motorElectrico = new MotorElectrico();
    }
    
    @Override
    public void encender() {
        System.out.println("\nAdaptando encendido del motor Electrico...");
        motorElectrico.conectar();
        motorElectrico.activado();
    }

    @Override
    public void apagar() {
        System.out.println("\nAdaptando apagado del motor Electrico...");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }

    @Override
    public void acelerar() {
        System.out.println("\nAdaptando acelerado del motor Electrico...");
        motorElectrico.moveFaster();
    }
    
}
