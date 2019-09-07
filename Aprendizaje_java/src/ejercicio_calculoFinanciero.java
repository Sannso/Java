
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */
public class ejercicio_calculoFinanciero {
    
    public static void main(String[] args) {
        // Programa que mira como crece una
        // inversion porcentualmente con el tiempo
    
        Scanner input;
        input = new Scanner(System.in);
        
        int añoV;
        double dinero;
        String[][] matrizV;
        
        System.out.println("----- Estado financiero -----");
        System.out.print("Ingrese el monto de dinero: ");
        
        dinero = input.nextDouble();
        
        do{
        System.out.print("\nIngrese cuantos años desea visualizarla: ");
        añoV = input.nextInt();
        }while(añoV < 1);
        añoV = añoV+2;
        
        matrizV = new String[añoV][7];
        
        
        input.close();
        // --------------------------------------------------------------------
        
        // Creacion base de la "tabla"
        
        String num; // convierte los numeros de enteros a String
        
        for(int i=0; i<añoV; i++){
            
            for(int j=0; j<7; j++){
                num = String.valueOf((j-1)+10) + "%";
                matrizV[0][j] = num;
                matrizV[0][0] = "_|";
                
                if(i > 0 && j != 0){
                    num = String.valueOf(dinero);
                    matrizV[i][j]= num;
                }
            }
            
            
        }
        
        
        for(int j=0; j<(añoV-1); j++){
            num = String.valueOf(j);
            matrizV[j+1][0] = num;
            
        }
        
        
        
        //Visualizacion previa de la tabla base
        for(String[] e: matrizV){
            System.out.print("\n");
            for(String c: e){
                System.out.print(c + "\t");
            }
        }
        System.out.println("\n\n");
        
        
        //---------------------------------------------------------------------
        // Ahora hay que llenar los sitios faltantes
        // con sus respectivas operaciones
        
        
        double opPd, aum;
        for(int i=0; i<añoV; i++){
            aum = 1;
            
            for(int j=0; j<7; j++){
                // Condiciones para obviar las posiciones
                // de los lugares que ya se llenaron.
                
                if(i > 1 && j != 0){
                    
                    // Optiene el valor de su casilla de arriba
                    num = matrizV[i-1][j];
                    dinero = Double.parseDouble(num);
                    
                    
                    // Operaciones para el porcentaje
                    opPd = aum/10;
                    dinero = dinero+(dinero* opPd);
                    aum = aum+0.1;
                    
                    
                    // Se ingresa el valor a la matriz
                    num = String.valueOf(dinero);
                    matrizV[i][j] = num;
                    
                }
                
            }
            
            
        }
        
        
        for(int i=0; i<añoV; i++){
            System.out.println();
            for(int j=0; j<7; j++){
                
                if(i > 1 && j != 0){
                 
                    num = matrizV[i][j];
                    dinero = Double.parseDouble(num);
                    
                    System.out.printf("%1.1f", dinero);
                    System.out.print("\t");
                }
                else{
                    System.out.print(matrizV[i][j] + "\t");
                }
                
            }
            
            
        }
        System.out.println("\n\n");
        
    }
}
