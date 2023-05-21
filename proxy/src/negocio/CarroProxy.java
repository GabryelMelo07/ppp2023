package negocio;

import java.time.LocalDate;

public class CarroProxy implements IGaragem {

    private Carro carro;

    public CarroProxy(int ano, String modelo, String marca, String placa, long chassi) {
        this.carro = new Carro(ano, modelo, marca, placa, chassi);
    }

    public Carro getCarro() {
        return carro;
    }
    
    @Override
    public String manobrar(Empregado empregado) {
        if (LocalDate.now().minusYears(empregado.getAno_nascimento()).getYear() >= 18 && empregado.getCnh() != null) {
            return this.carro.manobrar(empregado);
        } else {
            return String.format("%s, é menor de 18 anos e/ou não tem CNH, e não pode manobrar o carro.", empregado.getNome());
        }
    }
    
}
