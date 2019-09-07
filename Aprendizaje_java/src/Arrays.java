
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */
public class Arrays {
    public static void main(String[] args) {
        
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
        ejemplo5();
    }
    
    public static void ejemplo1() {
        // Matriz de 1 dimension
        
        //int[] miMatriz1 = new int[4]  1ra forma de declaracion
        
        int[] miMatriz = {1,43,65,23,6,89,76,4};  // 2da forma de declaracion
        
        
        for(int i=0; i<miMatriz.length; i++){
            System.out.println("La posicion numero " + i + " = " + miMatriz[i]);
        }
        
    }
    
    public static void ejemplo2(){
        // Forma de recorrer una matriz con for each,
        // que se parece al for de python
    
        String[] paises = {"Colombia", "Argentina", "Mexico", "Japon", "Rusia"};
        
        for(String e: paises){
            System.out.println("Pais: " + e);
        }
    }

    public static void ejemplo3(){
        // rellenado de paises
        
        String[] paises = new String[8];
        
        for(int i=0; i<8; i++){
            paises[i] = JOptionPane.showInputDialog
                                        ( "Ingrese un pais   - Pais #" + (i+1));
        }
        
        for(String e: paises){
            System.out.println("Pais: " + e);
        }
    }

    public static void ejemplo4(){
        // Rellenar una matriz con numeros aleatorios
        
        int[] mNumA = new int[150];
        
        for(int i=0; i<mNumA.length; i++){
            mNumA[i] = (int)Math.round(Math.random() * 100);
        }
        
        for(int e: mNumA){
            System.out.println("Matriz: " + e);
        }
    }

    public static void ejemplo5(){
        // Matriz 2d
        
        int[][] matriz2d = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}    
        };
        
        
        
        for(int i=0; i<4; i++){
            
            for (int j=0; j<4 ; j++) {
                System.out.print(matriz2d[i][j]);
                
                if(j < 3){
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("\n\nImpresion con for each: \n");
        
        for(int[] fila: matriz2d){
            
            System.out.print("\n");
            
            for(int columna: fila){
                System.out.print(columna + "\t");
            }
            
        }
    }

}
  