package com.mitocode;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.Assert;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private IUsuarioRepo repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuarioTest() {
        Usuario u = new Usuario();
        u.setNombre("Usuario2");
        u.setClave(encoder.encode("789"));
        u.setId(2);
        Usuario retorno = repo.save(u);

        Assert.isTrue(retorno.getClave().equals(u.getClave()));
        //No pude hacer lo que hizo el vago, pero esto parece que anda
    }

}
