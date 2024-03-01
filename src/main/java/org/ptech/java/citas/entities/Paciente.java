package org.ptech.java.citas.entities;

import java.time.LocalDate;

import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Paciente extends Usuario{
    private String email;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;  
    private Double peso;
    private TipoSangre tipoSangre;
    private char factoRH;

    
    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
    }

    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion,
            String email, Long celular, LocalDate fechaNacimiento, Double altura, Double peso, TipoSangre tipoSangre,
            char factoRH) {
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factoRH = factoRH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactoRH() {
        return factoRH;
    }

    public void setFactoRH(char factoRH) {
        this.factoRH = factoRH;
    }

    
}
