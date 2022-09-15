package arg.proyecto.persona.impl;

import arg.proyecto.persona.domain.Persona;
import arg.proyecto.persona.repository.PersonaRepository;
import arg.proyecto.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    /*Autowire:
    * hace lo mismo que en los beans pero
    * de manera automática
    *
    * en otras palabras hace la inyeccion de dependecia de manera automatica XD*/

    /*quizas generemos mas validaciones?*/
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona registrar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> ListarTodos() {
        return personaRepository.findAll();
    }
}
