package com.example.ms_persona.beans;

import lombok.*;

import java.time.LocalDate;

@Data
public class RequestPersona {

        private int id;

        private String nombre;

        private String correo;


        private String apellidoPaterno;


        private String apellidoMaterno;


        private LocalDate fechaNacimiento;

}
