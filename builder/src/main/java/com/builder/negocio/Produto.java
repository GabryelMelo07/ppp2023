package com.builder.negocio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Produto {
    private int id;
    private String nome;
    private int qtdeEstoque;
    private double preco;
}
