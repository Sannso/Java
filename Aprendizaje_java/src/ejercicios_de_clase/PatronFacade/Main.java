/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronFacade;

/**
 *
 * @author Santiago
 */
public class Main {
    public static void main(String[] args) {
        Fachada cliente1 = new Fachada("Pepito Perez");
        cliente1.solicitarHipoteca();
        
        Fachada cliente2 = new Fachada("Juanita Alcalde", false);
        cliente2.solicitarHipoteca();
    }
}
