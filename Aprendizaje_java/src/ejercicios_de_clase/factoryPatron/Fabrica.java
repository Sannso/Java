/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.factoryPatron;

/**
 *
 * @author Santiago
 */
public class Fabrica {
    public static AConexion GetConexion(String TipoFabrica){
        if(TipoFabrica.equalsIgnoreCase(null)){
            return new ConexionVacia();
        }
        if(TipoFabrica.equalsIgnoreCase("Android")){
            return new ConexionAndroid();
        }
        else if(TipoFabrica.equalsIgnoreCase("IOs")){
            return new ConexionIOs();
        }
        else return new ConexionVacia(); // Mi modificacion porque como lo tienen los compañeros no funciona
    }
}
