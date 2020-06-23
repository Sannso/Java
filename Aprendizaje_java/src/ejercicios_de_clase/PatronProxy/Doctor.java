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
public class Doctor implements ICitas{

    @Override
    public void agendarCitas() {
        System.out.println("Cita agendada");
    }

    @Override
    public Paciente atenderPaciente(Paciente paciente, boolean isEfective) {
        paciente.setisSick(isEfective);
        String r = (isEfective == true)? "Si":"No";
        System.out.println("El paciente " + paciente.getName()
                + " esta curado?: " + r);
        return paciente;
    }
    
}
