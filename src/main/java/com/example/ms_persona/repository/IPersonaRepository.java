package com.example.ms_persona.repository;

import com.example.ms_persona.beans.BaniPayBean;
import com.example.ms_persona.beans.RequestPersona;

import javax.servlet.http.HttpServletRequest;

public interface IPersonaRepository {

    BaniPayBean create(RequestPersona persona, HttpServletRequest request);
}
