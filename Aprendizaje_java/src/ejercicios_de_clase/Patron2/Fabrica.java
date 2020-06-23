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
public class Fabrica {
    public static AConexion GetConexion(String TipoFabrica){
        if(TipoFabrica.equalsIgnoreCase(null)){
            return new ConexionVacia();
        }
        if(TipoFabrica.equalsIgnoreCase("Lavadora")){
            return new ConexionLavadora();
        }
        else if(TipoFabrica.equalsIgnoreCase("Secadora")){
            return new ConexionSecadora();
        }
        else return new ConexionVacia(); // Mi modificacion porque como lo tienen los compañeros no funciona
    }
}
