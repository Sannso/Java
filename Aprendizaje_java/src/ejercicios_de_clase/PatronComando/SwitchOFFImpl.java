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
public class SwitchOFFImpl implements IAccionSwitch{
    
    private BombillaLed bombillaLed;
    
    public SwitchOFFImpl(BombillaLed b){
        this.bombillaLed = b;
    }
    
    @Override
    public void execute() {
        //Podria haber solo un metodo switch y se le enviaria el booleano
        bombillaLed.switchOFF();
    }
    
}
