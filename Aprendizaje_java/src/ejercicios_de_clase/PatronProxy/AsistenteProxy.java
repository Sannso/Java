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
public class AsistenteProxy implements ICitas{

    private Doctor doctor;
        
    @Override
    public void agendarCitas() {
        if(doctor == null){
            doctor = new Doctor();
        }
        System.out.println("Verificando agenda de citas");
        doctor.agendarCitas();
    }

    @Override
    public Paciente atenderPaciente(Paciente paciente, boolean isEfective) {
        if(doctor == null){
            doctor = new Doctor();
        }
        System.out.println("Organizando atencion del"
                + " paciente + " + paciente.getName());
        doctor.atenderPaciente(paciente, isEfective);
        return paciente;
    }
    
}
