package model.Personagem;

import model.ComportamentoDeAtaque.AttackWithBow;

public class Rainha extends Personagem {

    public Rainha (String nome) {
        super(nome);
        super.setAttackBehavior(new AttackWithBow());
    }

}
