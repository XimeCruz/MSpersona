package com.example.ms_persona.controller;

import com.example.ms_persona.beans.BaniPayBean;
import com.example.ms_persona.beans.RequestPersona;
import com.example.ms_persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tigo")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping(path = "/persona")
    public ResponseEntity<BaniPayBean> personaCreate (@RequestBody RequestPersona persona, final HttpServletRequest request){

        return ResponseEntity.ok(personaService.create(persona,request));

    }

}
