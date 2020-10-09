package com.mitocode.rest;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")//Con esto el link ahora es http://localhost:8080/personas, antes era http://localhost:8080
public class RestDemoController {

    @Autowired
    private IPersonaRepo repo;

    @GetMapping
    public List<Persona> listar() {
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Persona per) {
        repo.save(per);
    }
    @PutMapping
    public void modificar(@RequestBody Persona per) {
        repo.save(per);
        //Uso save aca tambien porque si encuentra que la persona ya existe la modifica, es transparente
    }
    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer idParaEliminar) {
        repo.deleteById(idParaEliminar);
        //Por el motivo que sea no anda con el 0, creo que dice algo de que esta repetido o algo asi, seguro me mande alguna cagada
    }
    //Get: obtener datos
    //Post: insercion
    //Put: actualizacion total de datos
    //Delete: eliminacion de datos
}
