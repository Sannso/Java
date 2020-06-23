/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronIterator;

/**
 *
 * @author Santiago
 */
public class main {
    public static void main(String[] args) {
        
        String[] estudiantes = {"Pepe", "Juan", "Santiago", "Sebastian",
                                "David", "Alejandra", "Valentina", "Camila",
                                "Esteban", "Estefany"};
        
        DataBase vector = new DataBase(estudiantes);

        //Creación del iterador
        IteradorVector iterador = vector.iterador();

        //Recorrido con el iterador
        while (iterador.hasNext())
            System.out.println(iterador.next());  

    }
}
