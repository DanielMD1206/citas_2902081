package org.ptech.java.citas.entities;

public class Medico {
    // POR REGLA GENERAL LOS ATRIBUTOS DE UNA CLASE DEBEN SER PRIVADOS
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroIdentificacion;
    private Long registroMedico;
    private Especialidad especialidad;

    // Constructor por defecto(vacio)
    // Siempre debe ser public
    public Medico() {
    }

    // Constructor parametrizado

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    // Getters and Setters deben ser publicos
    // Firma de un Getter:
    // Tipo de dato de retorno: tipo de dato del atributo
    // El nombre del metodo: get seguido del nombre del atributo
    // No tiene parametros
    // retorna: el valor del atributo 

    public String getNombres() {
        //return sirve para retornar el valor a quien lo llame 
        return this.nombres;
    }
     
    //Setters: sirve para asignar un valor a un atributo privado
    // Firma de un Setters:
    //Tipo de dato de retorno: void
    // El nomnbre del metodo: set seguido del nombre del atributo 
    // Tiene parametros: 1, input del valor a asignar al atributo  
    
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
