package com.mitocode.repo;

import com.mitocode.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
    //Se le pone Integer aunque sea un int el persona. Por que? no hay porque

}
