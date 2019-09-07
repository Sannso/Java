/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;
import java.util.Date;
import java.util.GregorianCalendar;
//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Uso_empleado {
    public static void main(String[] args) throws InterruptedException {
        
        int op;
        Empleado[] empleados;
        empleados = new Empleado[20];
        
        
        do {        
            
            op = menu();
            
            switch(op){
                case 1:
                    Empleado per;
                    System.out.println("\n\n\n\n\n\n");
                    per = CreacionEmpleado();
                    
                    
                    for(int i=0; i<20; i++){
                        if(empleados[i] == null){
                            empleados[i] = per;
                            break;
                        }
                    }
                break;
                
                case 2:
                    
                    System.out.println("\n\n\n\n\n\n");
                    
                    for(int i=0; i<20; i++){
                        if(empleados[i] != null){
                            System.out.println();
                            System.err.println("Empleado #"
                                    + (i+1)
                                    + "\n" + empleados[i].getDatos());
                            
                        }
                        else{
                            if(i == 0){
                                System.out.println("No hay empleados");
                                break;
                            }
                            else{
                                System.out.println("\nNo hay mas empleados.\n");
                                break;
                            }
                        }
                    }
                    
                break;
                
                case 3:
                    int id;
                    boolean C = false;
                    id = aumentoSalario();
                    
                    for(int i=0; i<20; i++){
                       
                        if(empleados[i] != null){
                        
                            if(empleados[i].getID() == id ){
                               System.out.println("Procesando el aumento de "
                                       + empleados[i].getNombre()
                                       + " Con el id "
                                       + empleados[i].getID());
                               empleados[i].setSueldo(10);
                               C = true;
                           }
                       } 
                    }
                    
                    if(C){
                        System.out.println("El aumento ha sido efectuado.");
                    }
                    else{
                        System.out.println("Dicho empleado no existe");
                    }
                break;
                
                case 4:
                    System.out.println("\nPrograma finalizado.\n");
                break;
                
                default:
                    System.out.println("\nEse valor no es correcto.\n");
                break;
            }
            
            Thread.sleep(4000);
            System.out.println("\n\n\n\n\n\n");
        } while (op != 4);
        
    }
    
    private static int menu(){
        
        int opcion;
        //Scanner input;
        //input = new Scanner(System.in);
        
        System.out.println("----- Empresa mamalona con empleados -----");
        System.out.println("\n1. Ingresar nuevo empleado");
        System.out.println("2. Ver empleados");
        System.out.println("3. Aumentar el salario de un empleado");
        System.out.println("4. Salir");
        System.out.print("\nIngrese su opcion: ");
        //opcion = input.nextInt();
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresar:"));
        
        //input.nextLine();
        //input.close();
        return opcion;
    }
    
    private static Empleado CreacionEmpleado(){
        
        Empleado e;
        String nombre;
        int edad, anyo, mes, dia;
        double sueldo;
        
        //Scanner input;
        //input = new Scanner(System.in);
        
        System.out.println("--- Ingreso de nuevo empleado ---");
        System.out.print("\nIngresar el nombre del empleado: ");
        //nombre = input.nextLine();
        nombre = JOptionPane.showInputDialog("Ingresar el nombre: ");
        System.out.print("\nIngresar la edad del empleado: ");
        //edad = input.nextInt();
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad: "));
        System.out.print("\nIngresar el sueldo del empleado: ");
        //sueldo = input.nextDouble();
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el sueldo"));
        
        System.out.println("\n\nProcesando...");
        System.out.println("Ingresar fecha de expedicion: ");
        
        System.out.print("\nIngresar el año actual: ");
        //anyo = input.nextInt();
        anyo = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año: "));
        System.out.print("\nIngresar el mes actual: ");
        //mes = input.nextInt();
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes: "));
        System.out.print("\nIngresar el dia actual: ");
        //dia = input.nextInt();
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia: "));
        
        e = new Empleado(nombre, edad, sueldo, anyo, mes, dia);
        
        //input.close();
        return e;
    }
    
    
    private static int aumentoSalario(){
        
        int id;
        
        System.out.println("\n\n--- Aumento de salario ---\n");
        System.out.println("Ingresa el Id de el beneficiario: ");
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Id de el beneficiario: "));
        
        return id;
        
    }
    
    
}



class Empleado{
    private final String nombre;
    private int edad;
    private double sueldo;
    private static int RaID = 1;
    private final int ID;
    private final Date altaContrato;
    
    public Empleado(String nombre,int edad,double sueldo,
            int anyo_alta, int mes_alta, int dia_alta){
        
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        
        //Se crea una fecha
        GregorianCalendar fecha;
        fecha = new GregorianCalendar(anyo_alta, mes_alta-1, dia_alta);
        
        //Se asigna esa fecha a esta variable tipo Date
        altaContrato = fecha.getTime(); // getTime:
                                            // devuelve un objeto de tipo Date
                                            // Por eso se pueden igualar
    
        ID = RaID;
        RaID++;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public int getID() {
        return ID;
    }
    
    public Date getAltaContrato() {
        return altaContrato;
    }
    
    public void setSueldo(double porcentaje){
        double porcent = sueldo * porcentaje/100;
        sueldo+= porcent;
    }
    
    public String getDatos(){
        return "Datos del empleado:"
                + "\nNombre: " + nombre
                + "\nId: " + ID
                + "\nEdad: " + edad
                + "\nSueldo: " + sueldo
                + "\nAlta del contrato: " + altaContrato;
    }
    
    
}