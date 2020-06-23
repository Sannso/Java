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
public interface ICitas {
    Paciente atenderPaciente(Paciente paciente, boolean isEfective);
    void agendarCitas();
}
