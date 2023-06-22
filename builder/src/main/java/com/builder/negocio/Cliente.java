package com.builder.negocio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cliente extends Pessoa {
    
    private String nomeMae;
    private String cpf;
    private Endereco endereco;

    public Cliente(int id, String nome) {
        super(id, nome);
    }

    public Cliente(int id, String nome, Endereco endereco) {
        super(id, nome);
        this.endereco = endereco;
    }

    public Cliente(String nome) {
        super(nome);
    }

}
