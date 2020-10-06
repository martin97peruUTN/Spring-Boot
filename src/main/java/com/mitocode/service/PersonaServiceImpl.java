package com.mitocode.service;

import com.mitocode.repository.IPersonaRepo;
import com.mitocode.repository.PersonaRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private IPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);
    }
}
