/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronFacade;

/**
 *
 * @author Santiago
 */
public class Fachada {
    
    private final Cliente cliente;
    private final Banco banco;
    private final Credito credito;
    private final Prestamo prestamo;
    
    public Fachada(String nombre){
        cliente = new Cliente(nombre);
        banco = new Banco();
        credito = new Credito();
        prestamo = new Prestamo();
        
    }
    
    //Posibilidad se saber si tiene fondos
    public Fachada(String nombre, boolean fondos){
        cliente = new Cliente(nombre);
        
        banco = new Banco();
        banco.setFondos(fondos);
        
        credito = new Credito();
        prestamo = new Prestamo();
        
    }
    
    //Posibilidad se saber si tiene fondos
    public Fachada(String nombre, boolean fondos, boolean goodCreditHist){
        cliente = new Cliente(nombre);
        
        banco = new Banco();
        banco.setFondos(fondos);
        
        credito = new Credito();
        prestamo = new Prestamo();
        
    }
    
    public void solicitarHipoteca(){
        System.out.println("\n\n------ Solicitud de Hipoteca ----------");
        System.out.println("Verificando posibilidad de Hipoteca...");
        
        if(banco.getFondos() && credito.getGoodCreditHist() && !prestamo.getTienePrestamo()){
            System.out.println("El/La Cliente con el nombre"
                    + " de " + cliente.getName() + " tiene la posibilidad"
                            + " de acceder a la Hipoteca");
            System.out.println("Otorgando prestamo de hipoteca...");
            System.out.println("Hipoteca entregada con exito!");
        }
        else if(!banco.getFondos()){
            System.out.println("No se puede conceder una hipoteca, "
                    + "el cliente no tiene fondos suficientes.");
        }
        else if(!credito.getGoodCreditHist()){
            System.out.println("No se puede conceder una hipoteca, "
                    + "el cliente no tiene buen historial crediticio.");
        }
        else if(prestamo.getTienePrestamo()){
            System.out.println("No se puede conceder una hipoteca, "
                    + "el cliente tiene prestamos pendientes");
        }
    }
}
