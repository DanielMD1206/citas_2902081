package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {
    public static void main(String[] args) {

        Usuario u1 = new Usuario(1, "Julian", "Momoño", TipoDocumento.TI, 1019032812L);
        System.out.println(u1.toString());

        Medico m2 = new Medico(2, "Cristian", "Buitrago", TipoDocumento.CC, 1019036212L, 2L, Especialidad.OTORRINOLARINGOLOGIA);
        System.out.println(m2.toString());

        Paciente p1 = new Paciente(1, "Jesus", "Suarez", TipoDocumento.TI, 1019038921L, "Jesus@outlook.es", 329092112L, LocalDate.of(2007, Month.AUGUST, 20), 1.76, 65.07, TipoSangre.O, '-');
        System.out.println(p1.toString());
    }
}
