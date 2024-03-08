
package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Usuario {
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected TipoDocumento tipoDocumento;
    protected Long numeroIdentificacion;

    public String toString(){
        return "Nombres: " + this.nombres;
    }

    // Constructor
    public Usuario(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

}
