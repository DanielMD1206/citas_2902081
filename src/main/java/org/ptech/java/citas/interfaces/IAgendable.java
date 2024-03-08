package org.ptech.java.citas.interfaces;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {

    public boolean agendarCita(LocalDateTime fecha, Consultorio consultorio);
    public boolean reAendarCita( LocalDateTime nuevaFecha, Consultorio nuevoConsultorio);
    
}
