package negocio;

public class Carro implements IGaragem {

    private int ano;
    private String modelo;
    private String marca;
    private String placa;
    private long chassi;

    public Carro(int ano, String modelo, String marca, String placa, long chassi) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getChassi() {
        return chassi;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return String.format("Carro [modelo= %s, marca= %s, ano= %d, placa= %s, chassi= %d]", this.modelo, this.marca, this.ano, this.placa, this.chassi);
    }

    @Override
    public String manobrar(Empregado empregado) {
        return String.format("%s, está manobrando o carro: %s.", empregado.getNome(), this.modelo);
    }
    
}
