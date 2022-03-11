package com.example.ms_persona.service;

import com.example.ms_persona.beans.RequestPersona;
import com.example.ms_persona.beans.ResponseData;
import com.example.ms_persona.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public ResponseData create(RequestPersona persona, HttpServletRequest request) {


        return personaRepository.personCreate(persona,request);
    }
}
