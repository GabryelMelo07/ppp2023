import model.ComportamentoDeAtaque.AttackWithKnife;
import model.Personagem.Cavaleiro;
import model.Personagem.Rainha;
import model.Personagem.Rei;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando objeto Rainha, herdeiro da classe Personagem.
        Rainha rainha = new Rainha("Cersei Lannister");

        // Instaciando Rei.
        Rei rei = new Rei("Robb Stark");

        // Instanciando Cavaleiro.
        Cavaleiro cavaleiro = new Cavaleiro("Jon Snow");

        System.out.println("Vida do cavaleiro antes de ser atacado: \n" + cavaleiro);
        
        // Rainha ataca cavaleiro com sua arma padrão (inicial), causando 15 de dano.
        rainha.performAttack(cavaleiro);
        
        System.out.println();

        System.out.println("Vida do cavaleiro após ser atacado: \n" + cavaleiro);

        // Personagens podem trocar de arma mudando o comportamento de ataque.
        rainha.setAttackBehavior(new AttackWithKnife());

        System.out.println();
        System.out.println("Vida do rei antes de ser atacado: \n" + rei);
        System.out.println();
        // Rainha ataca o rei causando 8 de dano, pois agora está usando a faca ao invés do arco e flecha. 
        rainha.performAttack(rei);

        System.out.println("Vida do rei após ser atacado: \n" + rei);

        System.out.println();
        System.out.println("Vida da rainha antes de ser atacada: \n" + rainha);
        System.out.println();

        // Cavaleiro matando a rainha.
        for (int i = 0; i <= rainha.vida; i++) {
            cavaleiro.performAttack(rainha);
        }

        System.out.println("Vida da rainha após ser atacada: \n" + rainha);
        
    }
}
