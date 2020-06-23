/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memorama;
import javax.swing.*;

public class Carta {
    public String nombre;
    public ImageIcon pokemon;
    public int x;
    public int y;
    
    public Carta(String nombre, ImageIcon pokemon){
        this.nombre=nombre;
        this.pokemon=pokemon;
    }
    
    public String getnombre(){
        return this.nombre;
        }
    
}
