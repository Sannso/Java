/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronComando;

/**
 *
 * @author Santiago
 */
public class BombillaLed {
    private boolean isON;

    public BombillaLed(boolean oNoF) {
        isON = oNoF;
    }
    
    public void switchON(){
        System.out.println("Bombilla encendida.");
        isON = true;
    }
    
    public void switchOFF(){
        System.out.println("Bombilla apagada.");
        isON = false;
    }
}
