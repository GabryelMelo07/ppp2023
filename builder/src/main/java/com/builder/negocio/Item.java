package com.builder.negocio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Item {
    private int id;
    private Produto produto;
    private int qtde;
    private double preco;

    public Item(Produto produto, int qtde, double preco) {
        this.produto = produto;
        this.qtde = qtde;
        this.preco = preco;
    }
}
