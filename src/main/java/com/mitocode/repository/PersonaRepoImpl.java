package com.mitocode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mitocode.Application;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("El pedazo de boludo de "+nombre+" se registro");
    }
}
