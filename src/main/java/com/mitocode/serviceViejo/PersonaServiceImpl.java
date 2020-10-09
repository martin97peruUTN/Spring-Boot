package com.mitocode.serviceViejo;

import com.mitocode.repository.IPersonaRepoViejo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    @Qualifier("persona2")
    private IPersonaRepoViejo repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);
    }
}
