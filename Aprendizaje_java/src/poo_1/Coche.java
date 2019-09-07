/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;

/**
 *
 * @author Santiago
 */
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private String color;
    
    public Coche(){
        ruedas = 4;
        largo = 300;
        ancho = 150;
        color = "Negro";
    }

    public int getAncho() {
        return ancho;
    }

    public String getColor() {
        return color;
    }

    public int getLargo() {
        return largo;
    }

    public int getRuedas() {
        return ruedas;
    }


    public void setColor(String color) {
        this.color = color;
    }
 
    
    
    
    public void caracteristicas(){
        System.out.println("Caracteristicas del coche: "
                + "\nRuedas: " + ruedas 
                + "\nLargo: " + largo + " cm"
                + "\nAncho: " + ancho + " cm"
                + "\nColor: " + color);
        
    }
    
}
