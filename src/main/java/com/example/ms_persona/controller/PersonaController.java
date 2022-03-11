package com.example.ms_persona.controller;

import com.example.ms_persona.beans.RequestPersona;
import com.example.ms_persona.beans.ResponseData;
import com.example.ms_persona.service.PersonaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.tomcat.util.json.JSONParser;
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
    public ResponseEntity<ResponseData> personaCreate (@RequestBody RequestPersona persona, final HttpServletRequest request){

        //return ResponseEntity.ok(personaService.create(persona,request));

        //JsonObject jsonObject = new JsonParser().parse(personaService.create(persona,request)).getAsJsonObject();
//        JsonObject convertedObject = new Gson().fromJson(personaService.create(persona,request), JsonObject.class);
//        return convertedObject;
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.reader().forType(RequestPersona.class).readValue(personaService.create(persona,request));
//        return
        return personaService.create(persona,request);
    }

}
