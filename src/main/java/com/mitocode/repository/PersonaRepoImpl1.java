package com.mitocode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mitocode.Application;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersonaRepoViejo {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("El imbecil de "+nombre+" se registro");
    }
}
