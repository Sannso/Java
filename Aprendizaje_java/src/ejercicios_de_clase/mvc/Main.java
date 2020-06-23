/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.mvc;

/**
 *
 * @author Santiago
 */
public class Main {
    public static void main(String[] args){
        EjemploModel model = new EjemploModel();
        EjemploView view = new EjemploView();
        EjemploController controller = new EjemploController(model, view);
        
        controller.setName("Juan");
        controller.imprimirDatos();
        
    }
}
