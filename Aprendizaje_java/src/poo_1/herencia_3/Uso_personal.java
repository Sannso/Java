/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1.herencia_3;

/**
 *
 * @author Santiago
 */
public class Uso_personal {
    public static void main(String[] args) {
        
        Empleado empleado1;
        empleado1 = new Empleado("Juan", 1000, 2019, 4, 7);
        
        Jefe jefe1;
        jefe1 = new Jefe("Tom", 1500, 2019, 7, 3);
        jefe1.makeIncentivo(550);
        
        /*
        System.out.println("----- Personal -----");
        System.out.println("Empleado #1: ");
        System.out.println(empleado1.getDatos());
        System.out.println("\n\nEmpleado #2: ");
        System.out.println(jefe1.getDatos());
        
        System.out.println("\n\n-- Aumentando sueldos... --");
        empleado1.setSueldo(10);
        jefe1.makeIncentivo(550);
        
        System.out.println("\n\nEmpleado #1: ");
        System.out.println(empleado1.getDatos());
        System.out.println("\n\nEmpleado #2: ");
        System.out.println(jefe1.getDatos());
        
        System.out.println("ID empleado: " + empleado1.getID());
        System.out.println("ID jefe: " + jefe1.getID())

        */
        
        Persona[] arrayP = new Persona[6];
        
        arrayP[0] = empleado1;
        arrayP[1] = jefe1;   // Podemos ver el polimorfismo. Principio de sustitucion
        arrayP[2] = new Empleado("pepe", 500, 2020, 2, 3);
        arrayP[3] = new Estudiante("Santiago", "Ingenieria en sistemas");
        arrayP[4] = new Empleado("sebastian", 800, 2012, 8, 2);
        arrayP[5] = new Jefe("Jei", 1111, 2019, 6, 2);
        
        // se pueden refundir(casting) objetos pero debe tener sentido de esta forma
        
        Jefe jefe2 = (Jefe)arrayP[5];
        
        /* Esto debido a que si queremos utilizar un metodo en la forma:
            arrayP[x].metodo si en esa posicion esta obviamente un jefe, a pesar
            de eso no se pueden utilizar metodos de jefe porque el array es un
            objeto de tipo Persona
        */
        
        jefe2.makeIncentivo(500200);
        
        for(Persona e: arrayP){
            System.out.println("\n" + e.getDatos());
        }
        
    }
}
