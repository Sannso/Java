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
public class Elfo implements Personaje{
    private int health;
    private int attack;
    
    public Elfo(){
        health = 10;
        attack = 50;
    }
    
    
    @Override
    public Personaje clonar() {
        Elfo pj = null;
        
        try{
            pj = (Elfo) clone();
            return pj;
        }catch(CloneNotSupportedException e){
            //e.printStackTrace();
        }
        
        return null;
    }
}
