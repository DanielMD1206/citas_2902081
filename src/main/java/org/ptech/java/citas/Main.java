package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico(1, "Alexix", "Audor", TipoDocumento.TI, 1016952406L, 323232L, Especialidad.MEDICINA_GENERAL);
        Medico m2= new Medico(2, "Cristian", "Buitrago", TipoDocumento.CC, 1019032123L, 21321L, Especialidad.OTORRINOLARINGOLOGIA);

        System.out.println("======================= MEDICO 1 =======================" + "\n" + "Id del medico es: " + m1.getId() + "\n" + "Nombre del medico: " + m1.getNombres() + "\n" + "Apellido del medico: " + m1.getApellidos() + "\n" + "Especialidad del medico:  " + m1.getEspecialidad());
        System.out.println("======================= MEDICO 2 =======================" + "\n" + "Id del medico es: " + m2.getId() + "\n" + "Nombre del medico: " + m2.getNombres() + "\n" + "Apellido del medico: " + m2.getApellidos() + "\n" + "Especialidad del medico:  " + m2.getEspecialidad());

        Paciente p1 = new Paciente(1, "Daniel", "Cespedez", TipoDocumento.TI, 1201902912L, "Daniel@gmail.com", 321233212L, LocalDate.of(2000, Month.JUNE, 20), 1.61, 56.7, TipoSangre.AB, '-');
        Paciente p2 = new Paciente(2, "Juan", "Carlos", TipoDocumento.TI, 1201902222L, "Juan@gmail.com", 3231213212L, LocalDate.of(2002, Month.MARCH, 16), 1.71, 69.7, TipoSangre.A, '+');
        Paciente p3 = new Paciente(3, "Daniel", "Diaz", TipoDocumento.TI, 1901102912L, "DanD@gmail.com", 3214521232L, LocalDate.of(2005, Month.NOVEMBER, 11), 1.81, 90.7, TipoSangre.B, '+');
        Paciente p4 = new Paciente(4, "Jesus", "Caselles", TipoDocumento.CC, 120190281L, "Dios@gmail.com", 321219132L, LocalDate.of(1995, Month.DECEMBER, 24), 1.90, 86.7, TipoSangre.AB, '-');
        Paciente p5 = new Paciente(5, "Juan", "Gabriel", TipoDocumento.PPT, 1201902193L, "JG@gmail.com", 3212130912L, LocalDate.of(1980, Month.MAY, 01), 1.40, 49.7, TipoSangre.A, '+');

        Enfermero e1 = new Enfermero(17, "Daniel", "Gallo", TipoDocumento.TI, 1019028401L);
        e1.addProcedure("Aplicar inyecciones");

        System.out.println("====================== ENFERMERO 1 ======================");
        System.out.println("Nombre enfermero: " + e1.getNombres() + "\n" + "Apellido enfermero: " + e1.getApellidos());
        for (String f : e1.getProcedimiento()) {
            System.out.println("Procedimientos del enfermero: " + f);
        }
        Enfermero e2 = new Enfermero(1, "Danner", "Ariaz", TipoDocumento.TI, 10190219821L);
        e2.addProcedure("Lavado de oidos");
        
        System.out.println("====================== ENFERMERO 2 ======================");
        System.out.println("Nombre enfermero: " + e2.getNombres() + "\n" + "Apellido enfermero: " + e2.getApellidos());
        for (String n : e2.getProcedimiento()) {
            System.out.println("Procedimientos del enfermero: " + n);
        }

        Enfermero e3 = new Enfermero(2, "Laura", "Joya", TipoDocumento.TI, 1019001910L);
        e3.addProcedure("Aplicar inyecciones");
        e3.addProcedure("Cambio de pañales a mayores de edad");

        System.out.println("====================== ENFERMERO 3 ======================");
        System.out.println("Nombre enfermero: " + e3.getNombres() + "\n" + "Apellido enfermero: " + e3.getApellidos());
        for (String o : e3.getProcedimiento()) {
            System.out.println("Procedimientos del enfermero: " + o);
        }

        Consultorio c1 = new Consultorio(1, "CR93B #128D 02", 22);
        Consultorio c2 = new Consultorio(2, "CR52A 129", 11);

        CitaMedico cm1 = new CitaMedico(1, LocalDateTime.of(2024, Month.APRIL, 02, 10, 30, 10) , c1, "Gripa", p5, m2, EstadoCita.AGENDADA);
        CitaMedico cm2 = new CitaMedico(2, LocalDateTime.of(2025, Month.MAY, 20, 12, 30, 18) , c2, "Escopolamina", p3, m1, EstadoCita.AGENDADA);

        System.out.println("Cita: " + cm1.getId() + "\n" + "Consultorio: " + cm1.getConsultorio().getDireccion() + "\n" + "Fecha: " + cm1.getFecha() + "\n" +"Nombre Medico: " + cm1.getMedico().getNombres() + "\n" + "Rason: " + cm1.getRason() + "\n" + "Estado: " + cm1.getEstado());
        System.out.println("Cita: " + cm2.getId() + "\n" + "Consultorio: " + cm2.getConsultorio().getDireccion() + "\n" + "Fecha: " + cm2.getFecha() + "\n" +"Nombre Medico: " + cm2.getMedico().getNombres() + "\n" + "Rason: " + cm2.getRason() + "\n" + "Estado: " + cm2.getEstado());

        CitaEnfermero ce1 = new CitaEnfermero(1, LocalDateTime.of(2024, Month.MARCH, 17, 9, 20, 50), c2, null, p5, e1, EstadoCita.CANCELADA);
        CitaEnfermero ce2 = new CitaEnfermero(2, LocalDateTime.of(2024, Month.MARCH, 11, 9, 20, 50), c1, null, p2, e2, EstadoCita.CANCELADA);

        System.out.println("Cita: " + ce1.getId() + "\n" + "Fecha: " + ce1.getFecha() + "\n" + "Nombre enfermero: " + ce1.getEnfermero().getNombres() + "\n" + "Especializacion: " + e1.getProcedimiento() + "\n" + "Consultorio: " + ce1.getConsultorio().getDireccion() + "\n" + "Estado: " + ce1.getEstadoCita());
    }
}