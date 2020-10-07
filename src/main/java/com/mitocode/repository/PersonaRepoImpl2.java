package com.mitocode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mitocode.Application;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepoViejo {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("El pedazo de boludo de "+nombre+" se registro");
    }
}
