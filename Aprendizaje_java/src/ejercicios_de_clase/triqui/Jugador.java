/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.triqui;

//import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Jugador {
    
    private final String nombreJugador;
    private boolean canPlay = false;
    static int nJ = 1;
    
    public Jugador(){
        nombreJugador = "Jugador" + String.valueOf(nJ);
        nJ = nJ + 1;
    }
    
    public Jugador(String name){
        this.nombreJugador = name;
    }
    
    public String getNamePlayer(){
        return nombreJugador;
    }
    
    public void changeTurn(){
        canPlay = !canPlay;
    }
    
    public boolean jugar(){
        return canPlay;
    }
    
    public void resetnJ(){
        nJ = 1;
    }
}
