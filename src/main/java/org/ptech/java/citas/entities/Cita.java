package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;

public class Cita{
    private int id;
    private LocalDateTime fecha;
    private Consultorio consultorio;
    private String rason;
    Paciente paciente;
    


    public Cita(int id, LocalDateTime fecha, Consultorio consultorio, String rason, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.rason = rason;
        this.paciente = paciente;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public LocalDateTime getFecha() {
        return fecha;
    }



    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }



    public Consultorio getConsultorio() {
        return consultorio;
    }



    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }



    public String getRason() {
        return rason;
    }



    public void setRason(String rason) {
        this.rason = rason;
    }



    public Paciente getPaciente() {
        return paciente;
    }



    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
}
