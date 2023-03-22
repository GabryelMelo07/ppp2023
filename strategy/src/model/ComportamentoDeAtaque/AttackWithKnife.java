package model.ComportamentoDeAtaque;

import model.Personagem.Personagem;

public class AttackWithKnife implements AttackBehavior {

    @Override
    public void dano(Personagem personagem) {
        personagem.vida -= 8;
    }
    
}
