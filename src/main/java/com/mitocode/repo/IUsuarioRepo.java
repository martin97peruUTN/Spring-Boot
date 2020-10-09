package com.mitocode.repo;

import com.mitocode.model.Persona;
import com.mitocode.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
    //Se le pone Integer aunque sea un int el persona. Por que? no hay porque
    //Voy a test/java/AplicationTests
    Usuario findByNombre(String nombrecito);
    //Es como hacer SELECT * FROM usuario WHERE usuario.nombre=nombrecito
}
