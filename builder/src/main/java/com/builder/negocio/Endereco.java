package com.builder.negocio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String complemento;
    private String nro;
}
