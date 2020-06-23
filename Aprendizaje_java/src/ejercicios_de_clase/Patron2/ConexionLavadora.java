/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.Patron2;

import ejercicios_de_clase.factoryPatron.*;

/**
 *
 * @author Santiago
 */
public class ConexionLavadora implements AConexion{

    @Override
    public void encendido() {
        System.out.println("Lavadora encendida");
    }
    
    @Override
    public void apagado() {
        System.out.println("Lavadora apagada");
    }
    
}
