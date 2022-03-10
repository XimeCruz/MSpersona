package com.example.ms_persona.service;

import com.example.ms_persona.beans.BaniPayBean;
import com.example.ms_persona.beans.RequestPersona;
import com.example.ms_persona.repository.IPersonaRepository;
import com.example.ms_persona.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class PersonaService implements IPersonaRepository {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public BaniPayBean create(RequestPersona persona, HttpServletRequest request) {
        return personaRepository.personCreate(persona,request);
    }
}
