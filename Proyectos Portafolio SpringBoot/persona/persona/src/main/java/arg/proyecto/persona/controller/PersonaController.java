package arg.proyecto.persona.controller;

import arg.proyecto.persona.domain.Persona;
import arg.proyecto.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("v1/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> obtenerPersona(){

        return personaService.ListarTodos();
    }

    //Cuando indicamos que vamos a recibir una entidad utilizamos un
    // ResponseEntity <entidad>
    @PostMapping
    public ResponseEntity <Persona> registrar(@Valid @RequestBody Persona persona){

        return new ResponseEntity<Persona>(personaService.registrar(persona), HttpStatus.CREATED);
    }
}
