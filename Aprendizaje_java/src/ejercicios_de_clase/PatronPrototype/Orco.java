/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronPrototype;

/**
 *
 * @author Santiago
 */
public class Orco implements Personaje{
    private int health;
    private int attack;
    
    public Orco(){
        health = 60;
        attack = 10;
    }
    
    
    @Override
    public Personaje clonar() {
        Orco pj = null;
        
        try{
            pj = (Orco) clone();
            return pj;
        }catch(CloneNotSupportedException e){
            //e.printStackTrace();
        }
        
        return null;
    }
}
