package com.builder.negocio;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class Pedido {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;
}