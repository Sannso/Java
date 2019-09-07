/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos_especiales;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Tipos_enumerados {
    
    //Vr1 //enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE };
    
    enum Talla{
        MINI("S"), MEDIANO("L"), GRANDE("L"), MUY_GRANDE("XL");
        
        private final String abreviatura;
        
        private Talla(String abreviatura){ //cuando se crea el objeto,
                                          //el constructor es llamado segun
                                         //la "opcion" que se haya escogido 
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura() {
            return abreviatura;
        }
        
    }

    public Tipos_enumerados() {
    }
    
    
    public static void main(String[] args) {
        // los tipos enumerados los usamos cuando queremos que el usuario
        // escoja unicamente un tipo de datos (variables) o casas que deseamos
        // ademas, con esas "variables" podemos hacer metodos get y set
        
        /*Vr1
        Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
        
        System.out.println(s);
        */
    
    
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("Ingresa la talla"
                                    + " (MINI, MEDIANO, GRANDE, MUY_GRANDE): ");
    
        String miTalla = input.next().toUpperCase();
        
        Talla miOta = Enum.valueOf(Talla.class, miTalla);
        
        System.out.println("La Talla es: " + miOta);
        System.out.println("La Abreviatura es: " + miOta.getAbreviatura());
    }
}
