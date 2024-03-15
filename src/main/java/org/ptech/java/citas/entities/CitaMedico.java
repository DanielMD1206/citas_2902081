package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable{

    Medico medico;
    EstadoCita estado;

    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, String rason, Paciente paciente,
            Medico medico, EstadoCita estado) {
        super(id, fecha, consultorio, rason, paciente);
        this.medico = medico;
        this.estado = estado;
    }



    public Medico getMedico() {
        return medico;
    }



    public void setMedico(Medico medico) {
        this.medico = medico;
    }



    public EstadoCita getEstado() {
        return estado;
    }



    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }



    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio consultorio) {
        this.setFecha(fecha);
        this.setConsultorio(consultorio);
        return true;
    }

    @Override
    public boolean reAendarCita(LocalDateTime nuevaFecha, Consultorio nuevoConsultorio) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoConsultorio);
        return true;
    }

    @Override
    public boolean cancelarCita(LocalDateTime cancelarFecha, Consultorio cancelarConsultorio){
        this.setFecha(cancelarFecha);
        this.setConsultorio(cancelarConsultorio);
        return true;
    }

}
