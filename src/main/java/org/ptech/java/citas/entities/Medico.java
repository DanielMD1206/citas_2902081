package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Medico extends Usuario{
    // POR REGLA GENERAL LOS ATRIBUTOS DE UNA CLASE DEBEN SER PRIVADOS
    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
    }

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
}
