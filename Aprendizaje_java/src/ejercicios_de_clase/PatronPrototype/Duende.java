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
public class Duende implements Personaje{
    private int health;
    private int attack;
    
    public Duende(){
        health = 45;
        attack = 15;
    }
    
    
    @Override
    public Personaje clonar() {
        Duende pj = null;
        
        try{
            pj = (Duende) clone();
            return pj;
        }catch(CloneNotSupportedException e){
            //e.printStackTrace();
        }
        
        return null;
    }
}
