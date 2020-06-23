/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.Bridge;

/**
 *
 * @author Santiago
 */
public class main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(new Elaborar());
        auto.procesar();
        auto.setImplementation(new Ensamblar());
        auto.procesar();
    }
}
