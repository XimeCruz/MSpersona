package com.example.ms_persona.repository;


import com.example.ms_persona.beans.RequestPersona;
import com.example.ms_persona.beans.ResponseData;
import com.example.ms_persona.beans.ResponsePersona;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@Repository
public class PersonaRepository {



    public ResponseData personCreate(RequestPersona persona, HttpServletRequest request) {
        final String CONTENT_TYPE = "Content-Type";

        /**
         * Constante ACCEPT que indica el parametro Accept del encabezado HTTP
         */
        final String ACCEPT = "Accept";


        String token = null;


        /*
         * se crea la cabecera http
         */
        HttpHeaders headersSolicitud = new HttpHeaders();
        /*
         * Se setean los encabezados
         */
        RestTemplate restTemplate = new RestTemplate();
        headersSolicitud.add(CONTENT_TYPE, "application/graphql");
        headersSolicitud.add(ACCEPT, MediaType.APPLICATION_JSON.toString());
        /**
         * Se setean los encabezados
         */

        /*
         * Se instancia a la clase restTemplate
         */
        String query="mutation {\n" +
                "\tregistrarPersona(\n" +
                "\t\tnombre:"+persona.getNombre()+"\",\n"+
                "\t\tcorreo: \""+persona.getCorreo()+"\",\n"+
                "\t\tapellidoPaterno:"+ persona.getApellidoPaterno()+"\",\n"+
                "\t\tapellidoMaterno:"+ persona.getApellidoMaterno()+"\",\n"+
                "\t\tfechaNacimiento:"+ persona.getFechaNacimiento()+"\",\n"+
                "\t){\n" +
                "        nombre,\n" +
                "        correo\n" +
                "    }\n" +
                "}";
        String query1="mutation {\n" +
                "\tregistrarPersona(\n" +
                "\t\tnombre: \""+persona.getNombre()+"\",\n" +
                "\t\tcorreo: \""+persona.getCorreo()+"\",\n" +
                "\t\tapellidoPaterno: \""+ persona.getApellidoPaterno()+"\",\n" +
                "\t\tapellidoMaterno: \""+ persona.getApellidoMaterno()+"\",\n" +
                "\t\tfechaNacimiento: \""+ persona.getFechaNacimiento()+"\",\n" +
                "\t){\n" +
                "        nombre,\n" +
                "        correo\n" +
                "    }\n" +
                "}";
        ResponseData data= new ResponseData();
        ResponseEntity<ResponseData> response = restTemplate.postForEntity("http://localhost:8080/graphql", new HttpEntity<>(query1, headersSolicitud),ResponseData.class);
        System.out.println("The response================="+response);

        if(response.getStatusCode()==HttpStatus.OK){
            data=response.getBody();
        }
        ResponsePersona responsePersona= new ResponsePersona();
        return data;


    }
}
