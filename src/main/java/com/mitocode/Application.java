package com.mitocode;

import com.mitocode.serviceViejo.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    @Autowired
    private IPersonaService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Buenaaaaaaaaaaaaaaaaaaas");
        service.registrar("Peru");
    }
}

//Clase 11
//https://stackoverflow.com/questions/15576064/the-local-psql-command-could-not-be-located