package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.EstadoCita;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto Medico 
        //Intanciar Medico
        //Una manera a dar valor a atributos privados es a traves del constructor parametrizado
        Medico m = new Medico(1 ,"Aleex" , "Orostegui" , TipoDocumento.CC , 1016952406L , 18032007L , Especialidad.PEDIATRA);

        //Intanciar otro medico
        Medico m2 = new Medico();
        //Se debe utilizar primero el setters del atributo a asignar 
        m2.setNombres("Danner");
        m2.setApellidos("Arias");
        m2.setTipoDocumento(TipoDocumento.TI);
        m2.setNumeroIdentificacion(1085046484L);

        Paciente p = new Paciente(001 , "Andrea" , "Camacho" , TipoDocumento.CC , 12345678L , "Andrea@gmail.com" , 3213213231L , LocalDate.now() , 1.70 , 45.8 , TipoSangre.A , '+' );

        Paciente p2 = new Paciente();
        p2.setId(9);
        p2.setNombres("Axel");
        p2.setApellidos("ochoa");
        p2.setTipoDocumento(TipoDocumento.CC);
        p2.setNumeroDocumento(121341313L);
        p2.setEmail("aorostegui@gmail.com");
        p2.setCelular(12415413613L);
        p2.setFechaNacimiento(LocalDate.now());
        p2.setAltura(1.76);
        p2.setPeso(46.9);
        p2.setTipoSangre(TipoSangre.A);
        p2.setFactoRH('+');


        Consultorio cn = new Consultorio();
        cn.setId(01);
        cn.setDireccion("Calle 127 d 95 A 77");
        cn.setNumero(16);

        Cita c = new Cita();
        c.setId(1);
        c.setFecha(LocalDateTime.now());
        c.setMedico(m);
        c.setPaciente(p);
        c.setConsultorio(cn);
        c.setEstado(EstadoCita.AGENDADA);

        System.out.println("Nombre del paciente:" +p.getNombres()+ " | "  + "Apellido del paciente : " + p.getApellidos() +  " | " + "Fecha de la cita: "+ c.getFecha() + " | " + "Estado de la cita:" + " " + c.getEstado() + " | " + "Numero de consultorio : " + cn.getNumero() + " | " + "Medico del paciente :" + m.getNombres() +" "+ m.getApellidos()  );


    }
}