package arg.proyecto.persona.service;

import arg.proyecto.persona.domain.Persona;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonaService {

    Persona registrar(Persona persona);
    List<Persona> ListarTodos();
}
