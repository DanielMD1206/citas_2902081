package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable{

    Enfermero enfermero;
    EstadoCita estadoCita;
    
    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, String rason, Paciente paciente,
            Enfermero enfermero, EstadoCita estadoCita) {
        super(id, fecha, consultorio, rason, paciente);
        this.enfermero = enfermero;
        this.estadoCita = estadoCita;
    }

    

    public Enfermero getEnfermero() {
        return enfermero;
    }



    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }



    public EstadoCita getEstadoCita() {
        return estadoCita;
    }



    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }



    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio consultorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public boolean reAendarCita(LocalDateTime nuevaFecha, Consultorio nuevoConsultorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAendarCita'");
    }

    @Override
    public boolean cancelarCita(LocalDateTime cancelarFecha, Consultorio cancelarConsultorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }
}
