package apresentacao;

import negocio.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando um objeto PROTÓTIPO, com todos atributos.
        Carro carroProduzido1 = new Carro();
        carroProduzido1.setModelo("Ford Fusion");
        carroProduzido1.setChassi("6MMTW8D425T006276".toCharArray());
        carroProduzido1.setAnoFabricacao(2023);
        carroProduzido1.setAnoModelo(2024);
        carroProduzido1.setCor("Vermelho Vermont");
        carroProduzido1.setNumPortas(5);
        carroProduzido1.setPotenciaHp(234);
        carroProduzido1.setTorque(35.5);
        carroProduzido1.setAltura(1.48);
        carroProduzido1.setLargura(2.12);
        carroProduzido1.setComprimento(4.87);
        carroProduzido1.setPeso(1.566);
        carroProduzido1.setTanque(62);
        carroProduzido1.setPortaMalas(514);

        System.out.println(String.valueOf("*").repeat(carroProduzido1.toString().length()));
        System.out.println(carroProduzido1);
        System.out.println(String.valueOf("-").repeat(carroProduzido1.toString().length()));
        
        // Objeto quase idêntico, poucos atributos mudam, podendo ser clonado.
        Carro carroProduzido2 = carroProduzido1.clone();
        carroProduzido2.setChassi("9BWSU19F08B302158".toCharArray());
        carroProduzido2.setCor("Preto Asturias");
        
        System.out.println(carroProduzido2);
        System.out.println(String.valueOf("*").repeat(carroProduzido1.toString().length()));
    }
}
