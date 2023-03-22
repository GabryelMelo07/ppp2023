package model.ComportamentoDeAtaque;

import model.Personagem.Personagem;

public class AttackWithSword implements AttackBehavior {

    @Override
    public void dano(Personagem personagem) {
        personagem.vida -= 10;
    }
    
}
