package negocio;

import java.util.Arrays;

public class Carro {

    private String modelo;
    private char[] chassi = new char[17];
    private int ano_fabricacao;
    private int ano_modelo;
    private String cor;
    private int num_portas;
    private int potencia_hp;
    private double torque;
    private double altura;
    private double largura;
    private double comprimento;
    private double peso;
    private int tanque;
    private int porta_malas;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public char[] getChassi() {
        return chassi;
    }

    public void setChassi(char[] chassi) {
        this.chassi = chassi;
    }

    public int getAnoFabricacao() {
        return ano_fabricacao;
    }

    public void setAnoFabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getAnoModelo() {
        return ano_modelo;
    }

    public void setAnoModelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPortas() {
        return num_portas;
    }

    public void setNumPortas(int num_portas) {
        this.num_portas = num_portas;
    }

    public int getPotenciaHp() {
        return potencia_hp;
    }

    public void setPotenciaHp(int potencia_hp) {
        this.potencia_hp = potencia_hp;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getPortaMalas() {
        return porta_malas;
    }

    public void setPortaMalas(int porta_malas) {
        this.porta_malas = porta_malas;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", chassi=" + Arrays.toString(chassi) + ", ano_fabricacao=" + ano_fabricacao
                + ", ano_modelo=" + ano_modelo + ", cor=" + cor + ", num_portas=" + num_portas + ", potencia_hp="
                + potencia_hp + "hp, torque=" + torque + "kgfm, altura=" + altura + "m, largura=" + largura + "m, comprimento="
                + comprimento + "m, peso=" + peso + "kg, tanque=" + tanque + "L, porta_malas=" + porta_malas + "L]";
    }

    public Carro clone() {
        Carro carro = new Carro();
        carro.setModelo(this.modelo);
        carro.setChassi(this.chassi);
        carro.setAnoFabricacao(this.ano_fabricacao);
        carro.setAnoModelo(this.ano_modelo);
        carro.setCor(this.cor);
        carro.setNumPortas(this.num_portas);
        carro.setPotenciaHp(this.potencia_hp);
        carro.setTorque(this.torque);
        carro.setAltura(this.altura);
        carro.setLargura(this.largura);
        carro.setComprimento(this.comprimento);
        carro.setPeso(this.peso);
        carro.setTanque(this.tanque);
        carro.setPortaMalas(this.porta_malas);
        return carro;
    }
    
}
