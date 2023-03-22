package model.Personagem;

import model.ComportamentoDeAtaque.AttackWithAxe;

public class Cavaleiro extends Personagem {

    public Cavaleiro(String nome) {
        super(nome);
        super.vida = 130;
        super.setAttackBehavior(new AttackWithAxe());
    }
    
}
