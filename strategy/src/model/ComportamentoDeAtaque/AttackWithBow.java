package model.ComportamentoDeAtaque;

import model.Personagem.Personagem;

public class AttackWithBow implements AttackBehavior {

    @Override
    public void dano(Personagem personagem) {
        personagem.vida -= 15;
    }
    
}
