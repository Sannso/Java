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
public class EjemploController {
    
    private EjemploModel model;
    private EjemploView view;
    
    public EjemploController(EjemploModel model, EjemploView view){
        this.model = model;
        this.view = view;
    }
    
    public String getName(){
        return model.getName();
    }
    
    public void setName(String name){
        model.setName(name);
    } 
    
    public String getId(){
        return model.getId();
    }
    
    public void imprimirDatos(){
        view.imprimirDatos(Integer.parseInt(model.getId()), model.getName());
    }
}
