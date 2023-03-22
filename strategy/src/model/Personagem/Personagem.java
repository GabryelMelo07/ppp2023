package model.Personagem;

import model.ComportamentoDeAtaque.AttackBehavior;

public abstract class Personagem {

    // COMPORTAMENTAIS: TROCAR DE ARMA E ATACAR COM CADA ARMA
    // Rainha: 100 vida, 20 dano (arco e flecha)
    // Rei: 115 vida, 10 dano (espada)
    // Cavaleiro: 130 vida, 20 dano (machado)

    private final String nome;
    public int vida;

    private AttackBehavior attackBehavior;

    Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public boolean isAlive() {
        return this.vida > 0;
    }

    public void performAttack(Personagem personagem) {
        if (personagem != this && this.isAlive() && personagem.isAlive()) {
            this.attackBehavior.dano(personagem);

            if (personagem.vida < 0) personagem.vida = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: {%s}, está com %d de vida.", this.getClass().getSimpleName(), this.nome, this.vida);
    }
    
}
