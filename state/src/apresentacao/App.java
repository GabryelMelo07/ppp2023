package apresentacao;

import negocio.Maquina;

public class App {
    public static void main(String[] args) throws Exception {
        
        Maquina maquina = new Maquina();
        System.out.println(maquina); // Maquina começa sem moedas.

        maquina.insereMoeda();
        System.out.println(maquina); // Moeda inserida, deve alterar para Maquina Recebeu Moeda.

        maquina.acionaAlavanca(); 
        System.out.println(maquina); // Alavanca acionada, altera para MaquinaGomaVendida.

        for (int i = 0; i < 6; i++) {  
            maquina.entregaGoma();
        }
        System.out.println(maquina); // Goma vendida 5 vezes, na sexta acaba o estoque e muda o estado para Gomas acabaram.

    }
}
