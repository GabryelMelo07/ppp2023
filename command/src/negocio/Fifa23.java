package negocio;

public class Fifa23 {

    private boolean correndo;
    private boolean tocando;
    
    public Fifa23() {
        this.correndo = false;
        this.tocando = false;
    }

    public boolean getCorrendo() {
        return this.correndo;
    }
    
    public boolean getTocando() {
        return this.tocando;
    }

    public void correr() {
        System.out.println("Jogador correndo.");
        this.correndo = true;
    }

    public void pararDeCorrer() {
        System.out.println("Jogador parou de correr.");
        this.correndo = false;
    }

    public void tocar() {
        System.out.println("Jogador tocou a bola.");
        this.tocando = true;
    }

    public void pararDeTocar() {
        System.out.println("Jogador terminou de tocar a bola.");
        this.tocando = false;
    }

}
