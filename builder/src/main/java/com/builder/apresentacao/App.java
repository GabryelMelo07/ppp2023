package com.builder.apresentacao;

import java.time.LocalDate;
import java.util.ArrayList;

import com.builder.negocio.Cliente;
import com.builder.negocio.Endereco;
import com.builder.negocio.Item;
import com.builder.negocio.Pedido;
import com.builder.negocio.Produto;
import com.builder.negocio.Vendedor;
import com.builder.negocio.Pedido.PedidoBuilder;

public class App {
    public static void main( String[] args ) {

        Vendedor vendedor = new Vendedor(1, "João", LocalDate.now());
        Cliente cliente = new Cliente(1, "Igor", new Endereco(1, "alfredo huch", "bgv", "sem complemento", "1000"));

        Produto produto1 = new Produto(1, "Produto1", 100, 2);
        Produto produto2 = new Produto(2, "Produto2", 200, 3);

        ArrayList<Item> items = new ArrayList<>();
        Item item1 = new Item(produto1, 2, produto1.getPreco());
        Item item2 = new Item(produto2, 4, produto2.getPreco());
        items.add(item1);
        items.add(item2);

        PedidoBuilder pedido = Pedido.builder().vendedor(vendedor).cliente(cliente).items(items);
        System.out.println(pedido);
        
    }
}
