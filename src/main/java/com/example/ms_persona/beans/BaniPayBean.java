package com.example.ms_persona.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BaniPayBean {
    @JsonProperty("codeError")
    private String codeError;
    @JsonProperty("msgError")
    private String msgError;

}
