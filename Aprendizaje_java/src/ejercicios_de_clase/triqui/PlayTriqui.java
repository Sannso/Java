/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.triqui;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class PlayTriqui {
    private Tablero table;
    private Jugador player1;
    private Jugador player2;
    private boolean playerWon = false;
    
    public PlayTriqui(){
        table = new Tablero();
        player1 = new Jugador();
        player1.changeTurn();
        player2 = new Jugador();
        
    }
    
    public PlayTriqui(String player1, String player2){
        table = new Tablero();
        this.player1 = new Jugador(player1);
        this.player1.changeTurn();
        this.player2 = new Jugador(player2);
        
    }
    
    
    private void messageWelcome(){
        System.out.println(" ---------- TRIQUI ---------- ");
        System.out.println(" Como jugar: Cuando diga \"Player# :\","
                + " Debes poner la posicion en la que quieres jugar\n");
        
        System.out.println("Comenzando...\n\n");
    }
    
    public void startGame(){
        messageWelcome();
        
        table.pintarTablero(11, ' ');
        
        boolean ciclo = true;
        while(ciclo){
            turno();
            ciclo = !playerWon;
        }
        
    }
    
    private int pedirPos(int posx){
        
        int input;
        
        if(posx == 1){
            Scanner mys = new Scanner(System.in);
            System.out.print("\n" + player1.getNamePlayer() + ": ");

            input =  mys.nextInt();

            while(input < 1 || input > 9){
                System.out.print("\n" + player1.getNamePlayer() + ": ");
                input =  mys.nextInt();
            }
            
        }
        else if(posx == 2){
            Scanner mys = new Scanner(System.in);
            System.out.print("\n" + player2.getNamePlayer() + ": ");

            input =  mys.nextInt();

            while(input < 1 || input > 9){
                System.out.print("\n" + player2.getNamePlayer() + ": ");
                input =  mys.nextInt();
            }
        }
        else{
            return 99;
        }
        
        return input;
    }
    
    private void nextTurn(){
        player1.changeTurn();
        player2.changeTurn();
    }
    
    
    private void finishGame(String name){
        if(playerWon){
            System.out.println("\n\n ------ TRIQUI!!!! ------");
            System.out.println("\n\n ------- FELICIDADES " + name + " ------");
        }
    }
    
    
    private void turno(){
        int pos;  
        
        if(player1.jugar()){
    
            pos = pedirPos(1);
            nextTurn();
            table.pintarTablero(pos-1, 'X');
            playerWon = table.verificarTriqui(pos-1);
            
            finishGame(player1.getNamePlayer()); // Verifica si el jugador gano o no
            
        }
        
        else if(player2.jugar()){
            
            pos = pedirPos(2);
            nextTurn();
            table.pintarTablero(pos-1, 'O');
            playerWon = table.verificarTriqui(pos-1);
            
            finishGame(player2.getNamePlayer());
        }
        else{
            System.out.println("ErrorNoEsElTurnoDeNingunJugador");
        }
        
    }
    
    
}
