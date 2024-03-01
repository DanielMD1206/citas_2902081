package org.ptech.java.citas.entities;

import java.util.ArrayList;
import java.util.List;

import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Enfermero extends Usuario {

    private List<String> procedimiento;

    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion) {
        // llamar el const¿ructor de la super clase
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
        // inicializar atributos intrinsecos de objeto
        this.procedimiento = new ArrayList<String>();
    }

    public void addProcedure(String procedure) {
        // añadir el string porcedimiento a la lista procedimiento
        this.procedimiento.add(procedure);
    }

    public List<String> getProcedimiento() {
        return procedimiento;
    }

}
