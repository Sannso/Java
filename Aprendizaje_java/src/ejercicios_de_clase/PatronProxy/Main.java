/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronProxy;

/**
 *
 * @author Santiago
 */
public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan Perez");
        
        ICitas asistente = new AsistenteProxy();
        asistente.agendarCitas(); // Se podria modificar atender para que solo
                                  // atienda a personas enfermas.
        asistente.atenderPaciente(paciente, true);
        
    }
}
