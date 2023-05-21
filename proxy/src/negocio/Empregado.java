package negocio;

import java.time.LocalDate;

public class Empregado {
    
    private String nome;
    private LocalDate data_nascimento;
    private Long cnh;

    public Empregado(String nome, LocalDate data_nascimento, Long cnh) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cnh = cnh;
    }

    public Empregado(String nome, LocalDate data_nascimento) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public int getAno_nascimento() {
        return data_nascimento.getYear();
    }

    public Long getCnh() {
        return cnh;
    }

    @Override
    public String toString() {
        return String.format("%s, data nascimento: %s.", this.nome, this.data_nascimento.toString());
    }
    
}
