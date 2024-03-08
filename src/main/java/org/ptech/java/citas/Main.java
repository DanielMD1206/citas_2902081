package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Cita;
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

        Medico m1 = new Medico(18, "Alexix", "Audor", TipoDocumento.TI, 1016952406L, 323232L,
                Especialidad.MEDICINA_GENERAL);
        System.out.println("======================== MEDICO ========================" + "\n" + "Id del medico es: "
                + m1.getId() + "\n" + "Nombre del medico: " + m1.getNombres() + "\n" + "Apellido del medico: "
                + m1.getApellidos() + "\n" + "Especialidad del medico:  " + m1.getEspecialidad());

        Enfermero e1 = new Enfermero(17, "Daniel", "Gallo", TipoDocumento.TI, 1019028401L);
        e1.addProcedure("Aplicar inyecciones");
        e1.addProcedure("Lavado de oidos");

        System.out.println("====================== ENFERMERO 1 ======================");
        for (String f : e1.getProcedimiento()) {
            System.out.println("Procedimientos del enfermero 1: " + f);
        }
        Enfermero e2 = new Enfermero(1, "Danner", "Ariaz", TipoDocumento.TI, 10190219821L);
        e2.addProcedure("Revisio de prostata");
        e2.addProcedure("Amputaciones");
        
        System.out.println("====================== ENFERMERO 2 ======================");
        for (String n : e2.getProcedimiento()) {
            System.out.println("Procedimientos del enfermero 2: " + n);
        }

    }
}