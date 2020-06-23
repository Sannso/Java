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
public class Main {
    public static void main(String[] args) {
        BombillaLed bombi = new BombillaLed(false);
        
        SwitchOFFImpl soff = new SwitchOFFImpl(bombi);
        SwitchONImpl son = new SwitchONImpl(bombi);
        
        Invoker ivk = new Invoker();
        ivk.recibirAccionSwitch(son);
        ivk.recibirAccionSwitch(soff);
        
        ivk.realizarAccionSwitch();
        
    }
}
