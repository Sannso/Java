/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronSingleton;

/**
 *
 * @author Santiago
 */
public class Main {
    public static void main(String[] args) {
        Reloj r = Reloj.getInstance();
        r.getTime();
        
    //Cuando el reloj llega a 50 seg, se detiene.
        
        Reloj r2 = Reloj.getInstance();
        System.out.println("El primer reloj es igual al segundo reloj?: " + r2.equals(r));
    }
    
}
