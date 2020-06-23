/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronPrototype;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class main {
    
    public static void main(String[] args){
        ArrayList<Elfo> pobladoElfos = new ArrayList<>();
        ArrayList<Duende> pobladoDuende = new ArrayList<>();
        ArrayList<Orco> poblacionOrco = new ArrayList<>();
        
        Elfo elfo = new Elfo();
        Orco orco = new Orco();
        Duende duende = new Duende();
        
        // --------- ELFOS --------------------
        pobladoElfos.add((Elfo) elfo.clonar());
        pobladoElfos.add((Elfo) elfo.clonar());
        pobladoElfos.add((Elfo) elfo.clonar());
        pobladoElfos.add((Elfo) elfo.clonar());
        
        // --------- ORCOS ----------------------
        pobladoDuende.add((Duende) duende.clonar());
        pobladoDuende.add((Duende) duende.clonar());
        pobladoDuende.add((Duende) duende.clonar());
        pobladoDuende.add((Duende) duende.clonar());
        
        // --------- DUENDES -------------------
        poblacionOrco.add((Orco) orco.clonar());
        poblacionOrco.add((Orco) orco.clonar());
        poblacionOrco.add((Orco) orco.clonar());
        poblacionOrco.add((Orco) orco.clonar());
    }
    
}
