/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.triqui;

/**
 *
 * @author Santiago
 */
public class Tablero {
    // Variable para el turno para jugar
    private char[] tablero = {'1','2','3','4','5','6','7','8','9'};
    
    public Tablero(){
    }
    
    public void pintarTablero(int pos, char print){
        
        if(pos == 11){
            System.out.println("\n");

            for(char n : tablero){
                if(n%3 == 0){
                    System.out.print(n);
                    System.out.println("");
                }
                else System.out.print(n + " ");
            }

            System.out.println("\n");
        }
        
        else if(pos >= 0 && pos <10){
            
            System.out.println("\n");

            tablero[pos] = print;
            
            int many = 1;
            for(char n : tablero){
                if(many%3 == 0){
                    System.out.print(n);
                    System.out.println("");
                }
                else System.out.print(n + " ");
                many++;
            }

            System.out.println("\n");
        }
        
        
    }
    
    
    public boolean verificarTriqui(int pos){
        
        boolean isTriqui = false;
        String tri = "";
        
        int f = 1;
        for(char n : tablero){
            
            tri = tri + n;
            //System.out.println(tri);
            if("XXX".equals(tri) || "OOO".equals(tri)){
                isTriqui = true;
            }
            
            if(f%3 == 0){
                tri = "";
            }
            f++;
        }
        
        for(int i =0; i<3 ; i++){
            
            tri = tri + tablero[i];
            tri = tri + tablero[i+3];
            tri = tri + tablero[i+6];
            
            //System.out.println(tri);
            if("XXX".equals(tri) || "OOO".equals(tri)){
                isTriqui = true;
            }
            
            tri = "";
        }
        
        
        for(int i =0; i<2 ; i++){
            
            tri = tri + tablero[i+i];
            tri = tri + tablero[(i+i)+4/(i+1)];
            tri = tri + tablero[(i+i)+8/(i+1)];
            
            //System.out.println(tri);
            if("XXX".equals(tri) || "OOO".equals(tri)){
                isTriqui = true;
            } 
            tri = "";
        }
        
        return isTriqui;
        
    }
    
}
