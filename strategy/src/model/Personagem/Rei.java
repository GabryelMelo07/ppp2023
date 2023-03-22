package model.Personagem;

import model.ComportamentoDeAtaque.AttackWithSword;

public class Rei extends Personagem {

    public Rei (String nome) {
        super(nome);
        super.vida = 115;
        super.setAttackBehavior(new AttackWithSword());
    }
    
}
