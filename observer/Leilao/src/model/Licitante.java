package model;

public class Licitante implements Observer {

    private String nome;

    public Licitante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void update(Licitante licitante, double lance) {
        System.out.printf("Eu, %s, recebi a mensagem:: ** Lance de: R$ %.02f, concedido por: %s **", this.nome, lance, licitante);
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
