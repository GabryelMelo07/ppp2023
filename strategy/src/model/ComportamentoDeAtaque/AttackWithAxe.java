package model.ComportamentoDeAtaque;

import model.Personagem.Personagem;

public class AttackWithAxe implements AttackBehavior {

    @Override
    public void dano(Personagem personagem) {
        personagem.vida -= 20;
    }
    
}
