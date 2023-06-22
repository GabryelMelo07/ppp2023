package com.builder.negocio;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vendedor extends Pessoa {
    
    private LocalDate inicio;
    private LocalDate fim;
    
    public Vendedor(int id, String nome) {
        super(id, nome);
    }

    public Vendedor(int id, String nome, LocalDate inicio) {
        super(id, nome);
        this.inicio = inicio;
    }
    
    public Vendedor(String nome) {
        super(nome);
    }

}