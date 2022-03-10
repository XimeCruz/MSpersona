package com.example.ms_persona.repository;

import com.example.ms_persona.beans.BaniPayBean;
import com.example.ms_persona.beans.RequestPersona;
import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

public class PersonaRepository implements IPersonaRepository {

    @Override
    public BaniPayBean create(RequestPersona persona, HttpServletRequest request) {
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
        headersSolicitud.add(CONTENT_TYPE,MediaType.G);
        headersSolicitud.add(CONTENT_TYPE, MediaType.APPLICATION_JSON.toString());
        headersSolicitud.add(ACCEPT, MediaType.APPLICATION_JSON.toString());
        /**
         * Se setean los encabezados
         */

        /*
         * Se instancia a la clase restTemplate
         */
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<RequestPersona> httpTokenService = new HttpEntity<>(persona, headersSolicitud);

        BaniPayBean baniPayBean = new BaniPayBean();
//        try {
//
//            ResponseEntity<BaniPayBean> result = restTemplate.postForEntity(
//                    "http://localhost:8080/graphql", httpTokenService, BaniPayBean.class);
//
//
//
//            if (result.getStatusCode() == HttpStatus.OK) {
//
//                baniPayBean = result.getBody();
//            }else {
//
//
//                enterezaBean.setCodeError("COD345");
//                enterezaBean.setMsgError("Token no valido o inexistente");
//
//            }
//
//
//        }catch(RestClientException e) {
//            enterezaBean.setCodeError("COD345");
//            enterezaBean.setMsgError("Servicio de autotizacion no disponible");
//
//        }
        return baniPayBean;

    }
}
