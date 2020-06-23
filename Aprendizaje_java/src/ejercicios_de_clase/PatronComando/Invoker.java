/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronComando;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class Invoker {
    private List<IAccionSwitch> accionSwitch = new ArrayList<>();

    public void recibirAccionSwitch(IAccionSwitch accion){
        this.accionSwitch.add(accion);
    }
    
    public void realizarAccionSwitch(){
        this.accionSwitch.forEach(x -> x.execute());
        this.accionSwitch.clear();
    }
}
